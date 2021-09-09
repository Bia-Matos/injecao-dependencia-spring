package com.beatriz.injecaodependenciaspring.service;

import com.beatriz.injecaodependenciaspring.entity.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificadorEmail {

    public NotificadorEmail() {
        System.out.println("NotificadorEmail");
    }

    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s atraves do e-mail %s: %s/n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}