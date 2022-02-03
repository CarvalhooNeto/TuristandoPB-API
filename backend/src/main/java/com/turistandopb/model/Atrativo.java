package com.turistandopb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Atrativo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)// PRIMARY KEY
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private String cidade;

    @Column(length = 2, nullable = false)
    private String estado;

    @Column(nullable = false)
    private String imagemURL;

    @Column(nullable = false)
    private String latitude;

    @Column(nullable = false)
    private String longitude;

    @Column(nullable = false)
    private String horario; 
}
