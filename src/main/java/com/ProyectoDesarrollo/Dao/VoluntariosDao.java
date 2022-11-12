package com.ProyectoDesarrollo.Dao;

import com.ProyectoDesarrollo.domain.Voluntarios;
import org.springframework.data.repository.CrudRepository;


public interface VoluntariosDao extends CrudRepository <Voluntarios, Long> {
    
}