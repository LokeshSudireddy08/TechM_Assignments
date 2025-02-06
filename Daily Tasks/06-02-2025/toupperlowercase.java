package io.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class toupperlowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arr= Arrays.asList("hello","ANURAG");
		List<String> uppercaselist=arr.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(uppercaselist);
	    List<String> lowercaselist=arr.stream().map(String::toLowerCase).collect(Collectors.toList());
	    System.out.println(lowercaselist);
	}
}
