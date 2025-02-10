package com.openedugo.openedugo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class EnvTest implements CommandLineRunner {

    private final Environment env;

    public EnvTest(Environment env) {
        this.env = env;
    }

    @Override
    public void run(String... args) {
        System.out.println("===========================================");
        System.out.println("✅ Entorno activo: " + env.getProperty("spring.profiles.active"));
        System.out.println("✅ Base de datos: " + env.getProperty("spring.datasource.url"));
        System.out.println("===========================================");
    }
}