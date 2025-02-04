package org.examples;

import java.util.ArrayList;
import java.util.List;

public class task5 {
	public static <T> List<T> alternatelist(List<T> list1,List<T> list2){
		int size1=list1.size();
		int size2=list2.size();
		int max=Math.max(size1, size2);
		List<T> newlist=new ArrayList<T>();
		for(int i=0;i<max;i++) {
			if(i<size1) newlist.add(list1.get(i));
			if(i<size2) newlist.add(list2.get(i));
		}
		return newlist;
	}
	public static void main(String[] args) {
		 List<Integer> list1 = List.of(1, 3, 5, 7);
	        List<Integer> list2 = List.of(2, 4, 6);
	        List<Integer> intlist = alternatelist(list1, list2);
	        System.out.println(intlist);
	        List<String> strList1 = List.of("apple", "orange", "banana");
	        List<String> strList2 = List.of("grape", "kiwi");
	        List<String> strlist = alternatelist(strList1, strList2);
	        System.out.println(strlist);
	        List<Double> doubleList1 = List.of(1.1, 2.2);
	        List<Double> doubleList2 = List.of(3.3, 4.4, 5.5);
	        List<Double> doublelist = alternatelist(doubleList1, doubleList2);
	        System.out.println(doublelist);
	}
}
