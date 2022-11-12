package com.ProyectoDesarrollo.service;

import com.ProyectoDesarrollo.domain.Voluntarios;
import java.util.List;
import java.util.List;


public interface VoluntariosService {
    public List<Voluntarios> getVoluntarioss(); 
    
    public Voluntarios getVoluntarios(Voluntarios voluntarios);
    
    public void save(Voluntarios voluntarios);
    
    public void delete(Voluntarios voluntarios);
}
