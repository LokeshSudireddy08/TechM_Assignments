package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleSpringEx1Application {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringEx1Application.class, args);  
		System.out.println("Hii, Hello, This is my first Spring - Boot Project");
	}

}
