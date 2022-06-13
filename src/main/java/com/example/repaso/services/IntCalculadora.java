package com.example.repaso.services;

import org.springframework.http.ResponseEntity;

public interface IntCalculadora {

    ResponseEntity getSuma(String numero1, String numero2);
    ResponseEntity getResta(String numero1, String numero2);

    ResponseEntity getMultiplicacion(String numero1, String numero2);

    ResponseEntity getDivision(String numero1, String numero2);
}
