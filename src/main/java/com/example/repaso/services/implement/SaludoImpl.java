package com.example.repaso.services.implement;
import com.example.repaso.services.IntSaludo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service

public class SaludoImpl implements IntSaludo {

    @Value("${saludo.dia}")
    String saludo1;

    public ResponseEntity saludoDia (String dia){
        String result = dia;
        return ResponseEntity.ok(saludo1);
    }

    @Value("${saludo.mediodia}")
    String saludo2;

    public ResponseEntity saludoMediodia (String mediodia){
        String result = mediodia;
        return ResponseEntity.ok(saludo2);
    }

    @Value("${saludo.noche}")
    String saludo3;

    public ResponseEntity saludoNoche (String noche){
        String result = noche;
        return ResponseEntity.ok(saludo3);
    }
}
