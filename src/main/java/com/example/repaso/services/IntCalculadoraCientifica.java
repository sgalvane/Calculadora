package com.example.repaso.services;

import org.springframework.http.ResponseEntity;

import javax.websocket.server.PathParam;

public interface IntCalculadoraCientifica {

    ResponseEntity getRaiz(String valor);

    ResponseEntity getSeno(String valor);

    ResponseEntity getCoseno(String valor);

    ResponseEntity getArea(String valor);

    ResponseEntity getPerimetro(String valor);

    ResponseEntity getTriangulo(String base, String altura);

    public ResponseEntity getMultiplos(String valor);

}
