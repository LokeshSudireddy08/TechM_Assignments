package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceEx1EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceEx1EurekaServerApplication.class, args);
		System.out.println("!!Eureka Server Started");
	}

}
