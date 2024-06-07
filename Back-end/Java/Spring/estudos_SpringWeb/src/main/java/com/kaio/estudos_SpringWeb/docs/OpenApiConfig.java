package com.kaio.estudos_SpringWeb.docs;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Minha API")
                        .version("1.0")
                        .description("Descrição da API")
                        .contact(new Contact()
                                .name("Seu Nome")
                                .email("seu.email@exemplo.com")));
    }

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("public")
                .packagesToScan("com.kaio.estudos_SpringWeb.controller") // Pacote onde estão seus controladores
                .pathsToMatch("/**")
                .build();
    }
}
