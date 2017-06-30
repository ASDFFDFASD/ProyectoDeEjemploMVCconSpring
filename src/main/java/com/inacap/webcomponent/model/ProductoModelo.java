/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inacap.webcomponent.model;

import java.util.ArrayList;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Luis
 */
@Entity
public class ProductoModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idProducto;
    private String nombreProducto;
    private String detalleProducto;
    private String cantidadProducto;
    private String precioProducto;
    private String categoriaProducto;
    private String visible;

    public static ArrayList<ProductoModelo> listaProductos = new ArrayList<>();

    public ProductoModelo() {
    }

    public ProductoModelo(Integer idProducto, String nombreProducto, String detalleProducto, String cantidadProducto, String precioProducto, String categoriaProducto, String visible) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.detalleProducto = detalleProducto;
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;
        this.categoriaProducto = categoriaProducto;
        this.visible = visible;
    }

    public ProductoModelo(String nombreProducto, String detalleProducto, String cantidadProducto, String precioProducto, String categoriaProducto, String visible) {
        this.nombreProducto = nombreProducto;
        this.detalleProducto = detalleProducto;
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;
        this.categoriaProducto = categoriaProducto;
        this.visible = visible;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDetalleProducto() {
        return detalleProducto;
    }

    public void setDetalleProducto(String detalleProducto) {
        this.detalleProducto = detalleProducto;
    }

    public String getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(String cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(String precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

   /* public void nuevoProducto(ProductoModelo producto) {
        int idProducto = 0;
        
        if (!listaProductos.isEmpty()) {
            for (ProductoModelo lista : listaProductos) {
                if (lista.getIdProducto() > idProducto) {
                   idProducto = lista.getIdProducto();
                }
            }
        }

        idProducto += 1;
        listaProductos.add(new ProductoModelo(idProducto, producto.getNombreProducto(),
                producto.getDetalleProducto(), producto.getCantidadProducto(),
                producto.getPrecioProducto(), producto.getCategoriaProducto(), producto.getVisible()));
    }

    public void modificarProducto(ProductoModelo producto) {
        if (!listaProductos.isEmpty()) {

            for (ProductoModelo lista : listaProductos) {
                if (Objects.equals(lista.getIdProducto(), producto.getIdProducto())) {
                    lista.setNombreProducto(producto.getNombreProducto());
                    lista.setDetalleProducto(producto.getDetalleProducto());
                    lista.setCantidadProducto(producto.getCantidadProducto());
                    lista.setPrecioProducto(producto.getPrecioProducto());
                    lista.setCategoriaProducto(producto.getCategoriaProducto());
                    lista.setVisible(producto.getVisible());
                }
            }
        }

    }

    public void eliminarProducto(ProductoModelo producto) {
        if (!listaProductos.isEmpty()) {
            ProductoModelo cat = new ProductoModelo();
            for (ProductoModelo lista : listaProductos) {
                if (Objects.equals(lista.getIdProducto(), producto.getIdProducto())) {
                    cat = lista;
                }
            }
            listaProductos.remove(cat);
        }
    }

    
        
    
*/
    

}
