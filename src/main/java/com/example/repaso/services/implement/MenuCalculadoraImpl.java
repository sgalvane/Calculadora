package com.example.repaso.services.implement;

import com.example.repaso.config.CalculadoraCientificaConfig;
import com.example.repaso.config.CalculadoraConfig;
import com.example.repaso.services.IntMenuCalculadora;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class MenuCalculadoraImpl implements IntMenuCalculadora {

   private final CalculadoraConfig calculadoraConfig;

   private final CalculadoraCientificaConfig calculadoraCientificaConfig;


    public MenuCalculadoraImpl(CalculadoraConfig calculadoraConfig, CalculadoraCientificaConfig calculadoraCientificaConfig) {
        this.calculadoraConfig = calculadoraConfig;
        this.calculadoraCientificaConfig = calculadoraCientificaConfig;
    }



    public ResponseEntity getMenu(){

        String resultado = "" +

                "\n"+calculadoraConfig.getMensaje(CalculadoraConfig.SUMA)+
                "\n"+calculadoraConfig.getMensaje(CalculadoraConfig.RESTA)+
                "\n"+calculadoraConfig.getMensaje(CalculadoraConfig.MULTIPLICACION)+
                "\n"+calculadoraConfig.getMensaje(CalculadoraConfig.DIVISION)+
                "\n"+calculadoraCientificaConfig.getFunciones(CalculadoraCientificaConfig.RAIZ)+
                "\n"+calculadoraCientificaConfig.getFunciones(CalculadoraCientificaConfig.SENO)+
                "\n"+calculadoraCientificaConfig.getFunciones(CalculadoraCientificaConfig.COSENO)+
                "\n"+calculadoraCientificaConfig.getFunciones(CalculadoraCientificaConfig.AREA)+
                "\n"+calculadoraCientificaConfig.getFunciones(CalculadoraCientificaConfig.PERIMETRO)+
                "\n"+calculadoraCientificaConfig.getFunciones(CalculadoraCientificaConfig.TRIANGULO)+
                "\n"+calculadoraCientificaConfig.getFunciones(CalculadoraCientificaConfig.MULTIPLOS);
        return ResponseEntity.ok(resultado);
    }

}
