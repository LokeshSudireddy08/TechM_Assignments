package io.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sortinglist {
	public static void main(String args[]) {
		List<String> arr=Arrays.asList("str","apple","aa","hello","zz");
		List<String> ascsort=arr.stream().sorted().collect(Collectors.toList());
		System.out.println(ascsort);
		List<String> dscsort=arr.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println(dscsort);
	}
}
