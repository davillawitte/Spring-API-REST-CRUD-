package com.example.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.restapi.database.RepositorioContato;
import com.example.restapi.entities.Contato;

@RestController
@RequestMapping("/contato")

public class ContatoREST {
    @Autowired //realiza a injeção de dependência automaticamente em classes Java
    private RepositorioContato repositorio;

    //Método Get
    @GetMapping
    public List<Contato> listar(){
        return repositorio.findAll();
    }

    //Método Create
    @PostMapping
    public void salvar(@RequestBody Contato contato){
        repositorio.save(contato);
    }

    //Método Update
    @PutMapping
    public void alterar(@RequestBody Contato contato){
        if(contato.getId()>0)
        repositorio.save(contato);
    }

    @DeleteMapping
    public void excluir(@RequestBody Contato contato){
        repositorio.delete(contato);
    }

}
