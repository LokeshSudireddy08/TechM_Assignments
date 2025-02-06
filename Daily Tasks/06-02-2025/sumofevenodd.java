package io.streams;

import java.util.Arrays;
import java.util.List;

public class sumofevenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr=Arrays.asList(1,2,3,4,5,6);
		int evensum= arr.stream().filter(i->i%2==0).mapToInt(Integer::intValue).sum();
		System.out.println(evensum);
		int oddsum= arr.stream().filter(i->i%2!=0).mapToInt(Integer::intValue).sum();
		System.out.println(oddsum);
	}

}
