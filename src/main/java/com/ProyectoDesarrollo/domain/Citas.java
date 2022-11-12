
package com.ProyectoDesarrollo.domain;

import java.io.Serializable;
import lombok.Data;

public class Citas {
    //FALTA CAMBIAR LOS NOMBRES SEGUN LAS TABLAS QUE SE CREEN
    //REALIZAR LOS IMPORTS CORRECTOS
@Data
@Entity
@Table(name="cliente")
public class Articulo implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_articulo")
    private Long idArticulo; //Hibernate lo convierte en id_categoria
    private Long idCategoria; //Hibernate lo convierte en id_categoria
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private boolean activo;

    public Articulo() {
    }

    public Articulo(Long idCategoria, String descripcion, String detalle, double precio, int existencias, boolean activo) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.activo = activo;
    }
}
}
