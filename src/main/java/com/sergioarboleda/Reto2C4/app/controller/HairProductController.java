/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sergioarboleda.Reto2C4.app.controller;

import com.sergioarboleda.Reto2C4.app.model.HairProduct;
import com.sergioarboleda.Reto2C4.app.services.HairProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author marcela
 */

@RestController
@RequestMapping("hairproducts")
@CrossOrigin(origins = "*")
public class HairProductController {
    
    @Autowired
    private HairProductService service;
    
    @GetMapping("/all")
    public List<HairProduct> getHairProduct(){
        return service.getAll();
    }

    @PostMapping("/all")
    @ResponseStatus(HttpStatus.CREATED)
    public HairProduct save(@RequestBody HairProduct hairproduct){
        return service.save(hairproduct);
    }
    
    @PutMapping("/all")
    @ResponseStatus(HttpStatus.CREATED)
    public HairProduct update(@RequestBody HairProduct hairproduct){
      return service.update(hairproduct);
    }
    
    @DeleteMapping("/all/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete (@PathVariable("reference") String reference){
      return service.delete(reference);
    } 

//*    @GetMapping("/emailexist/{email}")
  //*  public boolean existEmail(@PathVariable("email") String email){
  //*      return service.getUserByEmail(email);
  //*  }

 //*   @GetMapping("/{email}/{password}")
 //*   public HairProduct authUser(@PathVariable("email")String email, @PathVariable("password") String password){
   //*     return service.getUserByEmailAndPassword(email, password);
   //* } 

}
