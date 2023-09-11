package com.example.restapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// definir os atributos de Contato como private, significa que eles só podem ser acessados e modificados por métodos dentro da própria classe (getters e setters).

//informa que a classe é uma entidade que deve ser persistida no banco de dados
@Entity
public class Contato {
    //Mapeamento
    @Id //identificador da entidade
    @GeneratedValue(strategy = GenerationType.IDENTITY) // valor gerado automaticamente (autoincrement)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String telefone;
    @Column(nullable = false)
    private String email;

    public Long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
