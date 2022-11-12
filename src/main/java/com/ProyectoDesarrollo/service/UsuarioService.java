package com.ProyectoDesarrollo.service;

import com.ProyectoDesarrollo.domain.Usuario;
import java.util.List;
import java.util.List;


public interface UsuarioService {
    public List<Usuario> getUsuarios(); 
    
    public Usuario getUsuario(Usuario usuario);
    
    public void save(Usuario usuario);
    
    public void delete(Usuario usuario);
}