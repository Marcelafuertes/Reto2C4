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
    
    public Optional<HairProduct> getByReference(String reference){
         return repository.getByReference(reference);
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
    public HairProduct update(HairProduct product){
        Optional<HairProduct> existsProduct = repository.getByReference(product.getReference());
        if(existsProduct.isPresent()){
            if (product.getReference() !=null){
                existsProduct.get().setReference(product.getReference());                
            }
            if (product.getName() !=null){
                existsProduct.get().setName(product.getName()); 
            }
          //  if (user.getBirthtDay() !=null){
          //      existUser.get().setBirthtDay(user.getBirthtDay());
           // }
            //if (user.getMonthBirthtDay() !=null){
              //  existUser.get().setMonthBirthtDay(user.getMonthBirthtDay()); 
            //}
            if (product.getBrand() !=null){
                existsProduct.get().setBrand(product.getBrand());                
            }
            if (product.getCategory() !=null){
                existsProduct.get().setCategory(product.getCategory()); 
            }
            if (product.getDescription() !=null){
                existsProduct.get().setDescription(product.getDescription());
            }
            if (product.getPrice() !=0){
                existsProduct.get().setPrice(product.getPrice()); 
            }
            if (product.getQuantity() !=0){
                existsProduct.get().setQuantity(product.getQuantity()); 
            }
            if (product.getPhotography() !=null){
                existsProduct.get().setPhotography(product.getPhotography());
            }
            return repository.save(existsProduct.get());

        }else{
            return product;
        }
    }
    
    /**
     * 
     * @param id
     * @return
     */
    public boolean delete(String reference){
        Boolean aBoolean = getByReference(reference).map(product -> {
            repository.delete(product.getReference());
            return true;
        }).orElse(false);
        return aBoolean;
    }
    
}
