package com.example.chamado.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.chamado.model.Chamado;
import com.example.chamado.repository.Repositorio;
import org.springframework.web.bind.annotation.RequestParam;


@RestController


public class Controle {

    @Autowired
    private Repositorio acao;

    @PostMapping("/")
    public Chamado abrirChamado(@RequestBody Chamado c){
        return acao.save(c);
    }

    @GetMapping("/")
    public String teste() {
        return "Hello world!";
    }
    
    
}
