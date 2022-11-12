package com.ProyectoDesarrollo.Dao;

import com.ProyectoDesarrollo.domain.Veterinaria;
import org.springframework.data.repository.CrudRepository;


public interface VeterinariaDao extends CrudRepository <Veterinaria, Long> {
    
}
