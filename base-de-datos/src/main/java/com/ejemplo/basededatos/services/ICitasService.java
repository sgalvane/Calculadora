package com.ejemplo.basededatos.services;
import com.ejemplo.basededatos.model.CitasEntity;
import org.springframework.http.ResponseEntity;

public interface ICitasService {

    ResponseEntity crearCita(CitasEntity citasEntity);
}
