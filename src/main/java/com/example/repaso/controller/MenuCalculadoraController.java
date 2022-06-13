package com.example.repaso.controller;

import com.example.repaso.services.IntMenuCalculadora;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RequestMapping("/calculadora")
@RestController

public class MenuCalculadoraController {

    IntMenuCalculadora intMenuCalculadora;

    @GetMapping("/menu")

    public ResponseEntity getMenu(){
        return intMenuCalculadora.getMenu();
    }

}
