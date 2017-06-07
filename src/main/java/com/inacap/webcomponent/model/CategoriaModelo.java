/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inacap.webcomponent.model;

import java.util.ArrayList;
import java.util.Objects;

public class CategoriaModelo {
    
    
    public String nombre;
    public String detalle;
    public Integer idCategoria;
    public static ArrayList<CategoriaModelo> listaCategorias = new ArrayList<>();

   
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
    
    
    public void nuevaCategoria(CategoriaModelo categoria){
        
        int idMayor = 0;
        
        if (!listaCategorias.isEmpty()) {
            for (CategoriaModelo lista : listaCategorias) {
                
                if (lista.getIdCategoria() > idMayor) {
                    idMayor = lista.getIdCategoria();
                }
                
            }
        }
        idMayor += 1;
        
        
        
        listaCategorias.add(new CategoriaModelo(categoria.getNombre(), categoria.getDetalle(), idMayor));
        
    
    }
    
     public void modificarCategoria(CategoriaModelo categoria) {
        if (!listaCategorias.isEmpty()) {

            for (CategoriaModelo lista : listaCategorias) {
                if (Objects.equals(categoria.getIdCategoria(), lista.idCategoria)) {
                    lista.setNombre(categoria.getNombre());
                    lista.setDetalle(categoria.getDetalle());
                }
            }
        }

    }

    public void eliminarCategoria(CategoriaModelo categoria) {
       // if (!listaCategorias.isEmpty()) {
            CategoriaModelo cat = new CategoriaModelo();
            for (CategoriaModelo lista : listaCategorias) {
                if (Objects.equals(categoria.getIdCategoria(), lista.idCategoria)) {
                    cat = lista;
                   
                }
            }
            listaCategorias.remove(cat);
       // }
    }
    
    
    
    
}









