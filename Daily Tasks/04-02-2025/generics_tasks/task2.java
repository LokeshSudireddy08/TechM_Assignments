package org.examples;
import java.util.List;

public class task2 {
	public static <T extends Number> void listsum(List<T> arr) {
		int evensum=arr.stream().mapToInt(Number::intValue).filter(num-> num%2==0).sum();
		int oddsum=arr.stream().mapToInt(Number::intValue).filter(num->num%2!=0).sum();
		System.out.println("sum of even numbers:" +evensum);
		System.out.println("sum of odd sum:" + oddsum);
	}
	public static void main(String[] args) {
		List<Integer> arr= List.of(1,2,3,4,5);
		listsum(arr);
	}

}
