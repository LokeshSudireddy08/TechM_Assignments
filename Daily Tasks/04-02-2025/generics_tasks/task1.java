package org.examples;

import java.util.Arrays;

public class task1 {
	public static <T,V> void checkarray(T[] arr1,V[] arr2) {
		if(Arrays.equals(arr1, arr2)) System.out.println("both are equal");
		else System.out.println("not equal");
	}
	public static void main(String args[]) {
		Integer[] arr1= {1,2,3,4,5};
		Integer[] arr2= {1,2,3,4,5};
		checkarray(arr1,arr2);
		String[] strArr1 = {"Apple","Banana","Cherry"};
	    String[] strArr2 = {"Apple","Banana","Cherry"};
	    checkarray(strArr1, strArr2);
	}
}
