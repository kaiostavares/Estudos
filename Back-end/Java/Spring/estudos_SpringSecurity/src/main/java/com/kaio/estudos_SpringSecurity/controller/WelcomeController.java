package com.kaio.estudos_SpringSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Welcome to the Spring Security";
    }

    @GetMapping("/managers")
    public String managers(){
        return "Welcome Managers";
    }

    @GetMapping("/users")
    public String users(){
        return "Welcome Users";
    }
}
