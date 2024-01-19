package com.example.chamado.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

// Atraves do nosso modelo, poderemos gerar uma tabela no banco de dados e trafegar informações atraves da API


@Table(name = "chamados")
@Entity(name = "chamados")
@Getter
@Setter


public class Chamado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long protocolo;
    private String servidor;
    private String descricao;
    private String urgencia;
    private Date data;
    private String status;
    
    
}
