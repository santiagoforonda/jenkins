package com.santiago.jenkins.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    
    //Este es un nuevo comentario
    //Agregamos algo nuevo 2
    @GetMapping("/hello")
    public String saludar(){
        return "Hola Mundo con REST en Spring Boot";
    }

    //Este es otro comentario
    //Agregamos algo 1
    @GetMapping("/hello2")
    public String saludar2(){
        return "Hola Mundo con REST en Spring Boot";
    }


    @GetMapping("/hello3")
    public String saludar3(){
        return "Hola Mundo con REST en Spring Boot";
    }


    @GetMapping("/hello4")
    public String saludar4(){
        return "Hola Mundo con REST en Spring Boot";
    }


    //Otro comentario
    @GetMapping("/hello6")
    public String saludar6(){
        return "Hola Mundo con REST en Spring Boot";
    }

    //Agregando un comentario para que sea observado y disparado

    /*Algun dia me convertire en el profesional que quiero ser, dejare de cometer los errores que yo siempre comete y sere un mejor hombre */
    //Buenas buenas
    /*Este es el controller de la aplicacion */
    /*probando
    probando
    probando */
}
