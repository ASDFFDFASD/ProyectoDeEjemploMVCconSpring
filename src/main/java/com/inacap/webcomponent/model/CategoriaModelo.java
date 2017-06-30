/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inacap.webcomponent.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CategoriaModelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer idCategoria;
    
    public String nombre;
    
    public String detalle;


    public CategoriaModelo() {
    }

    public CategoriaModelo(String nombre, String detalle) {
        this.nombre = nombre;
        this.detalle = detalle;

   }

    private CategoriaModelo(String nombre, String detalle, Integer idCategoria) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

}
