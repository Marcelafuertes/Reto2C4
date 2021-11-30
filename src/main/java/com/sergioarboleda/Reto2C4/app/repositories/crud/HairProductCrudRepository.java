/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sergioarboleda.Reto2C4.app.repositories.crud;

import com.sergioarboleda.Reto2C4.app.model.HairProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author marcela
 */
public interface HairProductCrudRepository extends MongoRepository<HairProduct,String> {
    
    
}
