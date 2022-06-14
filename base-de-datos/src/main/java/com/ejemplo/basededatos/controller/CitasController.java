package com.ejemplo.basededatos.controller;


import com.ejemplo.basededatos.model.CitasEntity;
import com.ejemplo.basededatos.services.ICitasService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/citas")
public class CitasController {

    private ICitasService iCitasService;

    public CitasController(ICitasService iCitasService) {
        this.iCitasService = iCitasService;
    }

    @PostMapping
    public ResponseEntity crearCita(@RequestBody CitasEntity citasEntity){
        return iCitasService.crearCita(citasEntity);
    }
}
