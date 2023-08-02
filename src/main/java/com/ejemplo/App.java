package com.ejemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

@RestController
class SaludoController {

    @GetMapping("/saludo")
    public String obtenerSaludo() {
        return "¡Hola pepe, este es un saludo desde Spring Boot!";
    }
}
