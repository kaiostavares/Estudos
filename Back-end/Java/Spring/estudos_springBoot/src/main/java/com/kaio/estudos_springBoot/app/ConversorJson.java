package com.kaio.estudos_springBoot.app;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ConversorJson {
    private final Gson gson;

    public ConversorJson(@Autowired Gson gson) {
        this.gson = gson;
    }

    public ViaCepResponse converter(String json) {
        return gson.fromJson(json, ViaCepResponse.class);
    }
}
