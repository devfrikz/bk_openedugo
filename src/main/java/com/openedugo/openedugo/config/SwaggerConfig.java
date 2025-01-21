package com.openedugo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Openedugo API")
                        .description("Documentación de la API para Openedugo")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Equipo Openedugo")
                                .email("soporte@openedugo.com")
                                .url("https://www.openedugo.com")
                        )
                );
    }
}
