package com.ProyectoDesarrollo.service;

import com.ProyectoDesarrollo.domain.Veterinaria;
import java.util.List;
import java.util.List;


public interface VeterinariaService {
    public List<Veterinaria> getVeterinarias(); 
    
    public Veterinaria getVeterinaria(Veterinaria usuario);
    
    public void save(Veterinaria usuario);
    
    public void delete(Veterinaria usuario);
}