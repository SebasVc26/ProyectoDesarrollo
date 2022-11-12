package com.ProyectoDesarrollo.Dao;

import com.ProyectoDesarrollo.domain.Citas;
import org.springframework.data.repository.CrudRepository;


public interface CitasDao extends CrudRepository <Citas, Long> {
    
}
