package com.app;

import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyInputRunner implements CommandLineRunner{
	
	public void run(String...args) throws Exception
	{
		System.out.println("Hii.. Executing the CommandLine Arguments");
		System.out.println(args[0]);
		System.out.println(Arrays.asList(args));
		System.out.println("End of Command Line Runner");
	}
}
