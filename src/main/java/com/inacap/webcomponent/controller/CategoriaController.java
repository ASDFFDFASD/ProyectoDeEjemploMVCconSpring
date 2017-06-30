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
import com.inacap.webcomponent.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
/**
 *
 * @author Luis
 */
@Controller
public class CategoriaController {
    
    @Autowired
    private CategoriaRepository repository;
    
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
        
        repository.save(categoria);
        
        model.addAttribute("lista", repository.findAll());
         
        
        return "listacategorias";
    }
    
    
    
    @RequestMapping("/listarcategorias")
    public String listarCategorias(Model model){
        
        model.addAttribute("lista", repository.findAll());
        
       return "listacategorias"; 
    }
    
    @RequestMapping("/modificarcategoria")
    public String editarCategorias(Model model, CategoriaModelo categoria /*,@RequestParam Integer txtId*/){
        
        
        repository.save(categoria);
        
        model.addAttribute("lista",repository.findAll() );
        return "listacategorias";
    }
    
    @RequestMapping("/eliminarcategoria")
    public String eliminarCategorias(Model model, CategoriaModelo categoria /*, @RequestParam int eTxtId*/){
        
        CategoriaModelo cat = repository.findOne(categoria.getIdCategoria());
        
        
        repository.delete(cat);
        
        model.addAttribute("lista", repository.findAll());
        return "listacategorias";
    }
    
}
