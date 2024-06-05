package com.kaio.estudos_springBoot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {

    private final Remetente noreply;
    private final Remetente techTeam;

    @Autowired
    public SistemaMensagem(Remetente noreply, Remetente techTeam) {
        this.noreply = noreply;
        this.techTeam = techTeam;
    }

    public void enviarConfirmacaoCadastro(){
        System.out.println(noreply);
        System.out.println("Seu cadastro foi aprovado");
    }
    public void enviarMensagemBoasVindas(){
        if(techTeam.getEmail().equals("noreply@dio.com.br")){
            System.out.println(true);
        }
        techTeam.setEmail("tech@dio.com.br");
        System.out.println(techTeam);
        System.out.println("Bem-vindo à Tech Elite");
    }
}
