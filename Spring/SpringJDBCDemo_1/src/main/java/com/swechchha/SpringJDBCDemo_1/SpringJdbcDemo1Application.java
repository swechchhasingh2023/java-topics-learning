package com.swechchha.SpringJDBCDemo_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.swechchha.SpringJDBCDemo_1.model.Alien;
import com.swechchha.SpringJDBCDemo_1.repo.AlienRepo;

@SpringBootApplication
public class SpringJdbcDemo1Application {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringJdbcDemo1Application.class, args);
		Alien alien1 = context.getBean(Alien.class);
		alien1.setId(111);
		alien1.setName("Navin");
		alien1.setTech("Java");
		
		// JDBC Steps: 
		
		AlienRepo repo = context.getBean(AlienRepo.class);
		repo.save(alien1);
		
		System.out.println(repo.findAll());
		
	}

}
