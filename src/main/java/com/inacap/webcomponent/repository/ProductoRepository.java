/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inacap.webcomponent.repository;

import com.inacap.webcomponent.model.ProductoModelo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author luis
 */
public interface ProductoRepository extends JpaRepository<ProductoModelo, Integer>{
    
}
