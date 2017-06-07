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
    
    @RequestMapping("/nuevoproducto")
    public String page(Model model) {
        model.addAttribute("categoria", CategoriaModelo.listaCategorias );
        return "nuevoproducto";
    }
    
    @RequestMapping("/guardarproducto")
    public String guardarProducto(Model model, ProductoModelo producto){
        ProductoModelo pro = new ProductoModelo();
        pro.nuevoProducto(producto);
        
        model.addAttribute("producto", ProductoModelo.listaProductos);
        
        return "listaproductos";
    }
    
    @RequestMapping("/listarproductos")
    public String listarProductos(Model model, ProductoModelo modelo){
        model.addAttribute("producto",ProductoModelo.listaProductos);
        return "listaproductos";
    }
    
    @RequestMapping("/modificarproducto")
    public String modificarProducto(Model model, ProductoModelo producto){
    ProductoModelo product = new ProductoModelo();
    product.modificarProducto(producto);
    model.addAttribute("producto", ProductoModelo.listaProductos);
    return "listaproductos";
    }
    
    @RequestMapping("/eliminarproducto")
    public String eliminarProducto(Model model, ProductoModelo producto){
        ProductoModelo product = new ProductoModelo();
        product.eliminarProducto(producto);
        model.addAttribute("producto", ProductoModelo.listaProductos);
        return "listaproductos";
    }
    
}
