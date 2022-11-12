package com.ProyectoDesarrollo.Dao;

import com.ProyectoDesarrollo.domain.Usuario;
import org.springframework.data.repository.CrudRepository;


public interface UsuarioDao extends CrudRepository <Usuario, Long> {
    
}