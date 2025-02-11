package sample;

import java.util.Arrays;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6};
		int[] newarr=Arrays.copyOfRange(arr, 2, 5);
		System.out.println(Arrays.toString(newarr));
	}
}
