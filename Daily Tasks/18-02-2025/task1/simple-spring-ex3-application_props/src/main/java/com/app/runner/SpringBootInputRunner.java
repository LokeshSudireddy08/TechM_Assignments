package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class SpringBootInputRunner implements CommandLineRunner {
	
	@Value("${my.product.id}")
	private int prodId;
	@Value("${my.product.name}")
	private String name;
	@Value("${my.product.cost}")
	private int cost;
	@Value("${my.product.color}")
	private String color;
	@Value("${my.product.manufacture}")
	private String manufacture;
	
	@Override
	public String toString()
	{
		return "SprinBootInputRunner Data ProductId : "+prodId+" ProductName : "+name+" Cost : " + cost + " Color : " + color + " manufacture : " + manufacture + " ";
	}
	public void run(String...args) throws Exception{
		System.out.println(this);
	}
}


