package com.beatriz.injecaodependenciaspring.entity;

import lombok.Data;

@Data
public class Cliente {

    private String nome;
    private String email;
    private String telefone;
    private boolean ativo = false;

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public void ativar() {
        ativo = true;
    }
}