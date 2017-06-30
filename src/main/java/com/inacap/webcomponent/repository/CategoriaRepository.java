/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inacap.webcomponent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.inacap.webcomponent.model.CategoriaModelo;

/**
 *
 * @author luis
 */
public interface CategoriaRepository extends JpaRepository<CategoriaModelo, Integer>{
    
}
