package com.ejemplo.basededatos.services.impl;

import com.ejemplo.basededatos.model.CitasEntity;
import com.ejemplo.basededatos.repository.CitasRepository;
import com.ejemplo.basededatos.services.ICitasService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.Date;

@Service
public class CitasServiceImpl implements ICitasService {

    private CitasRepository citasRepository;

    public CitasServiceImpl(CitasRepository citasRepository) {
        this.citasRepository = citasRepository;
    }


    public ResponseEntity crearCita(CitasEntity citasEntity){
        citasEntity.setFechaCita(new Date());
        citasEntity.setFechaCreacion(new Date());
        CitasEntity citas=citasRepository.save(citasEntity);
        return ResponseEntity.ok(citas);
    }
}
