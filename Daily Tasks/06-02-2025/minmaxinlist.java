package io.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class minmaxinlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr=Arrays.asList(1,2,3,4,5,6,7,8);
		Optional<Integer> max=arr.stream().max(Integer::compareTo);
		Optional<Integer> min=arr.stream().min(Integer::compareTo);
		System.out.println(max);
		System.out.println(min);
	}

}
