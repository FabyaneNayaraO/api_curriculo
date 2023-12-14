package com.fabyane.curriculos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
public class Curriculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private String objetivo;
    private String experiencia;

    
    public Curriculo(String nome, String telefone, String email, String objetivo, String experiencia) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.objetivo = objetivo;
        this.experiencia = experiencia;
    }

   
}

