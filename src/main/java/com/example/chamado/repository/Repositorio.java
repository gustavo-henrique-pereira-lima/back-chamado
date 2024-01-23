package com.example.chamado.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.chamado.model.Chamado;

// Essa nossa interface é responsavel pelas manipulaçoes do nosso banco de dados


public interface Repositorio extends CrudRepository<Chamado, Long>{
    
}
