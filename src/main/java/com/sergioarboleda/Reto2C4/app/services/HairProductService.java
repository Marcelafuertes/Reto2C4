/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sergioarboleda.Reto2C4.app.services;

import com.sergioarboleda.Reto2C4.app.model.HairProduct;
import com.sergioarboleda.Reto2C4.app.repositories.HairProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


/**
 *
 * @author marcela
 */
@Service
public class HairProductService {
    
    @Autowired
    private HairProductRepository repository;
    
    public List<HairProduct> getAll(){
        return repository.getAll();
    }
    
    /**
     * 
     * @param product
     * @return
     */
public HairProduct save(HairProduct product){
    if(product.getReference()==null){
        return product;
    }else{
        Optional<HairProduct> existsProduct = repository.getByReference(product.getReference());
        if(existsProduct.isEmpty()){
            return repository.save(product);
        }else {
            return product;
            }
        }
    }

    
}
