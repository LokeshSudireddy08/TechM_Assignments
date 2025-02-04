package org.examples;

import java.util.List;

public class task3 {
	public static <T> int checkarray(List<T> arr,T target) {
		return arr.indexOf(target);
	}
	public static void main(String[] args) {
		List<Integer> arr1=List.of(1,3,4,5,6,6);
		System.out.println("index of list:"+ checkarray(arr1,6));
		List<String> arr2=List.of("apple","banana","grape");
		System.out.println("index of list:"+ checkarray(arr2,"apple"));
	}

}
