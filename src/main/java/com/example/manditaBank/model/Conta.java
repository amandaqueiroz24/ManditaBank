package com.example.manditaBank.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String conta;
    @Column(nullable = false)
    private Integer agencia;
    @Column(nullable = false)
    private String tipoConta;
    @Column(nullable = false)
    private Integer saldo;


}
