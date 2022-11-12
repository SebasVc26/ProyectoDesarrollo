package com.ProyectoDesarrollo.Dao;

import com.ProyectoDesarrollo.domain.Mascota;
import org.springframework.data.repository.CrudRepository;


public interface MascotaDao extends CrudRepository <Mascota, Long> {
    
}
