package com.kaio.estudos_springBoot;

import com.kaio.estudos_springBoot.app.SistemaMensagem;
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
	public CommandLineRunner run(SistemaMensagem sistema) throws Exception {
		return args -> {
			sistema.enviarConfirmacaoCadastro();
			sistema.enviarMensagemBoasVindas();
			sistema.enviarConfirmacaoCadastro();
			sistema.enviarMensagemBoasVindas();
		};
	}

}
