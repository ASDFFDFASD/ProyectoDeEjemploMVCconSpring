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
import com.inacap.webcomponent.repository.CategoriaRepository;
import com.inacap.webcomponent.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Luis
 */ 
@Controller
public class ProductoController {
    @Autowired
    private CategoriaRepository repository;
    @Autowired
    private ProductoRepository prepository;
     
    public static final String LISTA_PRODUCTOS = "listaproductos";
    public static final String ATR_CATEGORIA = "categoria";
    public static final String ATR_PRODUCTO = "producto";

    @RequestMapping("/nuevoproducto")
    public String page(Model model) {
        model.addAttribute(ATR_CATEGORIA, repository.findAll());
        return "nuevoproducto";
    }
 
    @RequestMapping("/guardarproducto")
    public String guardarProducto(Model model, ProductoModelo producto) {
       prepository.save(producto);
        model.addAttribute(ATR_PRODUCTO, prepository.findAll());
        model.addAttribute(ATR_CATEGORIA, repository.findAll());
        return LISTA_PRODUCTOS;
    }
  
    @RequestMapping("/listarproductos")
    public String listarProductos(Model model, ProductoModelo modelo) {
         model.addAttribute(ATR_PRODUCTO, prepository.findAll());
        model.addAttribute(ATR_CATEGORIA, repository.findAll());
      return LISTA_PRODUCTOS;
    }

    @RequestMapping("/modificarproducto")
    public String modificarProducto(Model model, ProductoModelo producto) {
        
       
        prepository.save(producto);
        model.addAttribute(ATR_PRODUCTO, prepository.findAll());
        model.addAttribute(ATR_CATEGORIA, repository.findAll());
        return LISTA_PRODUCTOS;
          
    }

    @RequestMapping("/eliminarproducto")
    public String eliminarProducto(Model model, ProductoModelo producto) {
        ProductoModelo pro = prepository.findOne(producto.getIdProducto());
        prepository.delete(pro);
        model.addAttribute(ATR_PRODUCTO, prepository.findAll());
        model.addAttribute(ATR_CATEGORIA, repository.findAll());
        
        return LISTA_PRODUCTOS;
       
    }

}
