package com.example.manditaBank.controller;

import com.example.manditaBank.model.Cliente;
import com.example.manditaBank.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public ResponseEntity<List<Cliente>> listar (){

        return  ResponseEntity.ok(clienteRepository.findAll());
    }

    @GetMapping("/buscarcliente/{cpf}")
    public ResponseEntity<Cliente> buscarCliente (@PathVariable String cpf){
        var cliente = clienteRepository.findByCpf(cpf);
        return cliente.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/buscarclientes/{nome}")
    public ResponseEntity<List<Cliente>> buscarClientes (@PathVariable String nome){
        var cliente = clienteRepository.findByNomeContainsIgnoreCase(nome);
        return ResponseEntity.ok(cliente);
    }

    @PostMapping
    public ResponseEntity<Cliente> salvar (@RequestBody Cliente cliente){
        try {
            return ResponseEntity.ok(clienteRepository.save(cliente));
        }catch (Exception ex){
            return ResponseEntity.internalServerError().build();
        }
    }
}
