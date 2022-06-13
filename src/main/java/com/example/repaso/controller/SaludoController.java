package com.example.repaso.controller;


import com.example.repaso.services.IntSaludo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/saludo")

public class SaludoController {

    private final IntSaludo intSaludo;

    public SaludoController(IntSaludo intSaludo) {
        this.intSaludo = intSaludo;
    }

    @GetMapping("/saludoDia")
    public ResponseEntity getSaludoDia(@PathParam("")String dia){
        return intSaludo.saludoDia(dia);
    }

    @GetMapping("/saludoTarde")
    public ResponseEntity getSaludoMedio(@PathParam("")String mediodia){
        return intSaludo.saludoMediodia(mediodia);
    }

    @GetMapping("/saludoNoche")
    public ResponseEntity getSaludoNoche(@PathParam("")String noche){
        return intSaludo.saludoNoche(noche);
    }

    }
