package com.ejemplo.basededatos.repository;

import com.ejemplo.basededatos.model.CitasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitasRepository  extends JpaRepository<CitasEntity,Long>{
}
