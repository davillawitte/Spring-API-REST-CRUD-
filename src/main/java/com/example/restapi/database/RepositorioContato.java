package com.example.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restapi.entities.Contato;

public interface RepositorioContato extends JpaRepository <Contato, Long> {
    
}
