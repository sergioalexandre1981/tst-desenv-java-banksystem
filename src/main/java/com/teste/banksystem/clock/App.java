package com.teste.banksystem.clock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 
 * @author Sergio Alexandre
 * @since 26 jan 2018 11:28
 * 
 * Run application
 *
 */
@SpringBootApplication
@EnableCaching
public class App {
	
    public static void main( String[] args ) {
    	SpringApplication.run(App.class, args);
    }
    
}
