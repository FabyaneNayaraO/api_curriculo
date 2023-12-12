package com.fabyane.curriculos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "curriculos")
public class Curriculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private String objetivo;
    private String experiencia;

 
    public Curriculo() {
       
    }

    
    public Curriculo(String nome, String telefone, String email, String objetivo, String experiencia) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.objetivo = objetivo;
        this.experiencia = experiencia;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public void setTelefone(String nome) {
        this.nome = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String nome) {
        this.nome = email;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
}

