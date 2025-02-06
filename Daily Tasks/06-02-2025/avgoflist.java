package io.streams;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.stream.*;
public class avgoflist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		System.out.println(arr);
		OptionalDouble res=arr.stream().mapToInt(Integer::intValue).average();
		System.out.println(res);
	}
}
