/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sergioarboleda.Reto2C4.app.repositories;

import com.sergioarboleda.Reto2C4.app.model.HairProduct;
import com.sergioarboleda.Reto2C4.app.repositories.crud.HairProductCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author marcela
 */
@Repository
public class HairProductRepository {
    
    @Autowired
    private HairProductCrudRepository repository;
    
    /**
     * 
     * @return 
     */

    public List<HairProduct> getAll(){
        return (List<HairProduct>) repository.findAll();
    }
    
    /**
     * 
     * @param reference
     * @return 
     */
    
    public Optional<HairProduct> getByReference(String reference){
        return repository.findById(reference);
    }
    
    /**
     * 
     * @param product
     * @return 
     */
    public HairProduct save(HairProduct product){
        return repository.save(product);
    }
    /**
     * 
     * @param id 
     */
    
    public void delete(String id){
        repository.deleteById(id);
    }
}
