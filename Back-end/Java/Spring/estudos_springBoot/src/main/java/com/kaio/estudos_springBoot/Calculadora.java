package com.kaio.estudos_springBoot;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }
}
