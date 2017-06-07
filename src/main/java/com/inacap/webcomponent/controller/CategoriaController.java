/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inacap.webcomponent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.inacap.webcomponent.model.CategoriaModelo;
/**
 *
 * @author Luis
 */
@Controller
public class CategoriaController {
    
    @RequestMapping("/nuevacategoria")
    public String nuevaCategoria(Model model) {
        //model.addAttribute("attribute", "value");
        return "nuevacategoria";
    }
    
    
    /*
      public String guardaCategoria(Model model,@RequestParam String txtnombre,@RequestParam String txtdetalle){
        return "listacategorias";
    }
    
    sirve para recibir los parametro 1 por 1
    */
    
    @RequestMapping("/guardacategoria")
    public String guardaCategoria(Model model,CategoriaModelo categoria){
     
        CategoriaModelo cat = new CategoriaModelo();
        cat.nuevaCategoria(categoria);
        
        model.addAttribute("lista", CategoriaModelo.listaCategorias);
         
        
        return "listacategorias";
    }
    
    @RequestMapping("/listarcategorias")
    public String listarCategorias(Model model){
        
        model.addAttribute("lista", CategoriaModelo.listaCategorias);
        
       return "listacategorias"; 
    }
    
    @RequestMapping("/modificarcategoria")
    public String editarCategorias(Model model, CategoriaModelo categoria){
        CategoriaModelo cat = new CategoriaModelo();
        cat.modificarCategoria(categoria);
        model.addAttribute("lista",CategoriaModelo.listaCategorias );
        return "listacategorias";
    }
    
    @RequestMapping("/eliminarcategoria")
    public String eliminarCategorias(Model model, CategoriaModelo categoria){
        CategoriaModelo cat = new CategoriaModelo();
        cat.eliminarCategoria(categoria);
        
        model.addAttribute("lista", CategoriaModelo.listaCategorias);
        return "listacategorias";
    }
    
}
