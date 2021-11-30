package com.sergioarboleda.Reto2C4;

import com.sergioarboleda.Reto2C4.app.repositories.crud.HairProductCrudRepository;
import com.sergioarboleda.Reto2C4.app.repositories.crud.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reto2C4Application implements CommandLineRunner {

    @Autowired
    private HairProductCrudRepository productRepository;
    
    @Autowired
    private UserCrudRepository userRepository;
    
    
    public static void main(String[] args) {
		SpringApplication.run(Reto2C4Application.class, args);
	}
        
        @Override
        public void run(String... args)throws Exception{
            productRepository.deleteAll();
            userRepository.deleteAll();
        }

}
