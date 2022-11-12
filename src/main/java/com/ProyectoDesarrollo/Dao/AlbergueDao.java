package com.ProyectoDesarrollo.Dao;

import com.ProyectoDesarrollo.domain.Albergue;
import org.springframework.data.repository.CrudRepository;


public interface AlbergueDao extends CrudRepository <Albergue, Long> {
    
}
