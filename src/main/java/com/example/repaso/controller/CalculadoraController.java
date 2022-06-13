package com.example.repaso.controller;

import com.example.repaso.services.IntCalculadora;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RequestMapping("/calculadora")
@RestController

public class CalculadoraController {

    private final IntCalculadora intCalculadora;

    public CalculadoraController(IntCalculadora intCalculadora) {
        this.intCalculadora = intCalculadora;
    }


    @GetMapping("/suma")

    public  ResponseEntity getSuma(@PathParam("numero1")String numero1, @PathParam("numero2")String numero2){
        return intCalculadora.getSuma(numero1, numero2);

    }


    @GetMapping("/resta")

    public ResponseEntity getResta(@PathParam("numero1")String numero1, @PathParam("numero2")String numero2){
        return intCalculadora.getResta(numero1, numero2);
    }


    @GetMapping("/multiplicacion")

    public ResponseEntity getMultiplicacion(@PathParam("numero1")String numero1, @PathParam("numero2")String numero2){
        return intCalculadora.getMultiplicacion(numero1, numero2);
    }


    @GetMapping("/division")

    public ResponseEntity getDivision(@PathParam("numero1")String numero1, @PathParam("numero2")String numero2){
        return intCalculadora.getDivision(numero1, numero2);
    }
}
