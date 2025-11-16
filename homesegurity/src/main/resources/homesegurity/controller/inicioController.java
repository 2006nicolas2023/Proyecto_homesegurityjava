package com.proyecto.homesegurity.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
class inicioController {
    @GetMapping("/")
    public String inicio(){
        return "conexion correcta a Mysql y alicacion funcionando";
    }
    
}