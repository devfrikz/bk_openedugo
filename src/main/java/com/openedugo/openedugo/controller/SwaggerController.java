package com.openedugo.openedugo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/swagger")
public class SwaggerController {
    @GetMapping
    public String Hello() {
        return "Hola desde Swagger de Openedugo";
    }
}
