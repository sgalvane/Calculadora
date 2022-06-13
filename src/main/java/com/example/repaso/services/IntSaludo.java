package com.example.repaso.services;

import org.springframework.http.ResponseEntity;

public interface IntSaludo {

    ResponseEntity saludoDia (String dia);

    ResponseEntity saludoMediodia (String mediodia);

    ResponseEntity saludoNoche (String noche);


}
