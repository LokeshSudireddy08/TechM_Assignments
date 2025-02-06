package io.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class countstringswithstartingletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arr=Arrays.asList("anurag","admin","apple","box");
		List<String> newlist=arr.stream().filter(str->str.charAt(0)=='a').collect(Collectors.toList());
		System.out.println(newlist);
	}
}
