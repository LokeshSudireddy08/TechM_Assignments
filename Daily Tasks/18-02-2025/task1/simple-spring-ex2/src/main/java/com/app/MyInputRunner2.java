package com.app;

import org.springframework.stereotype.Component;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
@Component
public class MyInputRunner2 implements CommandLineRunner{
	public MyInputRunner2()
	{
		System.out.println("This constructor is running");
	}
	public void run(String...args) throws Exception
	{
		System.out.println("This is the 2nd runner class");
		System.out.println(args[1]);
		System.out.println(Arrays.asList(args));
		System.out.println("End of the 2nd Runner class");
	}
}
