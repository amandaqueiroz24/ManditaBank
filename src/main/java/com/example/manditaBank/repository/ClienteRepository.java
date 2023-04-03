package com.example.manditaBank.repository;

import com.example.manditaBank.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByCpf (String cpf);
    List<Cliente> findByNomeContainsIgnoreCase(String nome);

}
