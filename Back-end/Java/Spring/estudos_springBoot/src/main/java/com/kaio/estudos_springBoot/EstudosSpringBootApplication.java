package com.kaio.estudos_springBoot;

import com.kaio.estudos_springBoot.app.ConversorJson;
import com.kaio.estudos_springBoot.app.ViaCepResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EstudosSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudosSpringBootApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(ConversorJson conversor) throws Exception {
		return args -> {
			String json = "{\"cep\": \"44380-000\",\"logradouro\": \"Fonte do Doutor\",\"localidade\": \"Bahia\"}";
			ViaCepResponse response = conversor.converter(json);
			System.out.println("Dados do CEP: " + response);
		};
	}

}
