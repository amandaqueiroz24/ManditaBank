package com.example.manditaBank.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("conta")
public class ContaController {

    @GetMapping
    public ResponseEntity<String> BemVindo(){
        return ResponseEntity.ok("Seja Bem vindo ao Mandita Bank");
    }
}
