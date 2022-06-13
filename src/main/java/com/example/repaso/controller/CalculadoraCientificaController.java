package com.example.repaso.controller;

import com.example.repaso.services.IntCalculadoraCientifica;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RequestMapping("/calculadora")
@RestController

public class CalculadoraCientificaController {

    IntCalculadoraCientifica intCalculadoraCientifica;


    @GetMapping("/raiz")

    public ResponseEntity getRaiz(@PathParam("valor")String valor){
        return intCalculadoraCientifica.getRaiz(valor);

    }

    @GetMapping("/seno")

    public ResponseEntity getSeno(@PathParam("valor")String valor) {
        return intCalculadoraCientifica.getSeno(valor);

    }

    @GetMapping("/coseno")

    public ResponseEntity getCoseno(@PathParam("valor")String valor){
        return intCalculadoraCientifica.getCoseno(valor);
    }

    @GetMapping("/circulo")

    public ResponseEntity getArea(@PathParam("valor")String valor){
        return intCalculadoraCientifica.getArea(valor);

    }

    @GetMapping("/perimetro")

    public ResponseEntity getPerimetro(@PathParam("valor")String valor){
        return intCalculadoraCientifica.getPerimetro(valor);
    }

    @GetMapping("/triangulo")

    public ResponseEntity getTriangulo(@PathParam("")String base, @PathParam("")String altura){
        return intCalculadoraCientifica.getTriangulo(base, altura);
    }

    @GetMapping("/multiplos")

    public ResponseEntity getMultiplos(@PathParam("valor")String valor){
        return intCalculadoraCientifica.getMultiplos(valor);
    }

}
