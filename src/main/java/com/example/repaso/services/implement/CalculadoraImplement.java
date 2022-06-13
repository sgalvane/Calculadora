package com.example.repaso.services.implement;

import com.example.repaso.config.CalculadoraConfig;
import com.example.repaso.services.IntCalculadora;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.websocket.server.PathParam;
import javax.xml.validation.Validator;

@Service
public class CalculadoraImplement implements IntCalculadora {


    CalculadoraConfig calculadoraConfig;

    public CalculadoraImplement(CalculadoraConfig calculadoraConfig) {
        this.calculadoraConfig = calculadoraConfig;
    }

    @Value("${calculadora.mensaje.suma}")
    String mensajeSuma;

    public ResponseEntity getSuma(String numero1, String numero2){

        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        int resultado= num1 + num2;
        return ResponseEntity.ok(resultado +" "+ mensajeSuma);
}

    @Value("${calculadora.mensaje.resta}")
    String mensajeResta;

    public ResponseEntity getResta(String numero1, String numero2){

        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        int resultado = num1 - num2;
        return ResponseEntity.ok(resultado + "" + mensajeResta);
    }

    @Value("${calculadora.mensaje.multiplicacion}")
    String mensajeMultiplicacion;

    public ResponseEntity getMultiplicacion(String numero1, String numero2){

        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        int resultado = num1 * num2;
        return ResponseEntity.ok(resultado + "" + mensajeMultiplicacion);
    }

    @Value("${calculadora.mensaje.division}")
    String mensajeDivision;

    public ResponseEntity getDivision(String numero1, String numero2){

        double num1 = Double.parseDouble(numero1);
        double num2 = Double.parseDouble(numero2);
        double resultado = num1 / num2;
        return ResponseEntity.ok(resultado + "" + mensajeDivision);
    }
}