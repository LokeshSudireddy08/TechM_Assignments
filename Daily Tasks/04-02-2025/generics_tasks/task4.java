package org.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task4 {
	public static <T> List<T> reverse(List<T> arr){
		List<T> reversedlist=new ArrayList<>(arr);
		Collections.reverse(reversedlist);
		return reversedlist;
	}
	public static void main(String[] args) {
		List<Integer> intList = List.of(1, 2, 3, 4, 5);
        List<Integer> reversedIntList = reverse(intList);
        System.out.println("Reversed Integer List: " + reversedIntList);

        List<String> strList = List.of("apple", "banana", "cherry");
        List<String> reversedStrList = reverse(strList);
        System.out.println("Reversed String List: " + reversedStrList);

        List<Double> doubleList = List.of(1.1, 2.2, 3.3, 4.4);
        List<Double> reversedDoubleList = reverse(doubleList);
        System.out.println("Reversed Double List: " + reversedDoubleList);
	}

}
