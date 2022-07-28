package com.lexpay.lexpay.domain.model;

import lombok.Data;

import java.util.List;

@Data
public class Usuario {
    private long id;
    private String nome;
    private String cpf;
    private List<Carteira> carteiras;
    private List<Cartao> cartoes;
    private Carteira carteiraPrincipal;
}
