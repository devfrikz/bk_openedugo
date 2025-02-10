package com.openedugo.openedugo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                // Deshabilitamos CSRF, útil para APIs o en desarrollo
                .csrf(csrf -> csrf.disable())
                // Permitir todas las peticiones sin autenticación
                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll())
                // Deshabilitamos el formulario de login
                .formLogin(form -> form.disable());

        return http.build();
    }
}
