package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AddMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddMicroserviceApplication.class, args);
	}

}
