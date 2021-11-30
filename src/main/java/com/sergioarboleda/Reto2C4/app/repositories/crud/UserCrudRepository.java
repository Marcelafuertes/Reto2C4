package com.sergioarboleda.Reto2C4.app.repositories.crud;


import com.sergioarboleda.Reto2C4.app.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;




/**
 * @author Marcela
 */

public interface UserCrudRepository extends MongoRepository<User,Integer> {

    /**
     * 
     * @param name
     * @return 
     */
    public Optional<User> findByName(String name);
    
    /**
     * 
     * @param name
     * @param email
     * @return 
     */
    public List<User> findByNameOrEmail(String name, String email);
    
    /**
     * 
     * @param email
     * @return 
     */
    public Optional<User> findByEmail(String email);
       
    /**
     * 
     * @param email
     * @param password
     * @return 
     */    
    public Optional<User> findByEmailAndPassword(String email, String password);
    
    /**
     * 
     * @param id
     * @param email
     * @param name
     * @return 
     */    
    public List<User> findByIdOrEmailOrName(Integer id, String email, String name);
}
