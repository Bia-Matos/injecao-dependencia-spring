package com.beatriz.injecaodependenciaspring.service;

import com.beatriz.injecaodependenciaspring.entity.Cliente;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    //declaro ele aqui mas se so tivesse ele seria sempre nulo
    private NotificadorEmail notificador;

    //injecao dependencia por meio do construtor
    public AtivacaoClienteService(NotificadorEmail notificador) {
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();
        notificador.notificar(cliente, "Seu cadastro no sistema esta ativo!");
    }
}