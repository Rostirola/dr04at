package br.edu.infnet.at.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class InicioController {

    @GetMapping
    public String inicio() {
        return "API FUNCIONANDO CODEPIPELINE";
    }
    
}
