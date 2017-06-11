/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inacap.webcomponent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.inacap.webcomponent.model.CategoriaModelo;
import com.inacap.webcomponent.model.ProductoModelo;

/**
 *
 * @author Luis
 */ 
@Controller
public class ProductoController {
     
    public static final String LISTA_PRODUCTOS = "listaproductos";
    public static final String ATR_CATEGORIA = "categoria";
    public static final String ATR_PRODUCTO = "producto";

    @RequestMapping("/nuevoproducto")
    public String page(Model model) {
        model.addAttribute(ATR_CATEGORIA, CategoriaModelo.listaCategorias);
        return "nuevoproducto";
    }
 
    @RequestMapping("/guardarproducto")
    public String guardarProducto(Model model, ProductoModelo producto) {
       ProductoModelo produc = new ProductoModelo();
       produc.nuevoProducto(producto);
        model.addAttribute(ATR_PRODUCTO, ProductoModelo.listaProductos);
        model.addAttribute(ATR_CATEGORIA, CategoriaModelo.listaCategorias);
        return LISTA_PRODUCTOS;
    }
  
    @RequestMapping("/listarproductos")
    public String listarProductos(Model model, ProductoModelo modelo) {
         model.addAttribute(ATR_PRODUCTO, ProductoModelo.listaProductos);
        model.addAttribute(ATR_CATEGORIA, CategoriaModelo.listaCategorias);
      return LISTA_PRODUCTOS;
    }

    @RequestMapping("/modificarproducto")
    public String modificarProducto(Model model, ProductoModelo producto) {
        ProductoModelo product = new ProductoModelo();
        product.modificarProducto(producto);
          model.addAttribute(ATR_PRODUCTO, ProductoModelo.listaProductos);
        model.addAttribute(ATR_CATEGORIA, CategoriaModelo.listaCategorias);
        return LISTA_PRODUCTOS;
          
    }

    @RequestMapping("/eliminarproducto")
    public String eliminarProducto(Model model, ProductoModelo producto) {
        ProductoModelo product = new ProductoModelo();
        product.eliminarProducto(producto);
        model.addAttribute(ATR_PRODUCTO, ProductoModelo.listaProductos);
        model.addAttribute(ATR_CATEGORIA, CategoriaModelo.listaCategorias);
        
        return LISTA_PRODUCTOS;
       
    }

}
