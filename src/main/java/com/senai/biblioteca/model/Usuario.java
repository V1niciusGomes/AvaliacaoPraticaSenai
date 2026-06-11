package com.senai.biblioteca.model;

import javax.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;
    private String email;
    private String senha;

    public boolean emailValido() {
        return email != null && email.contains("@");
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getSenha() { return senha; }

    public void setId(Long id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }
    public void setSenha(String senha) { this.senha = senha; }
}
