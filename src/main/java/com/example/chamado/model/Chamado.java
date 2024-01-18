package com.example.chamado.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Atraves do nosso modelo, poderemos gerar uma tabela no banco de dados e trafegar informações atraves da API

public class Chamado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
}
