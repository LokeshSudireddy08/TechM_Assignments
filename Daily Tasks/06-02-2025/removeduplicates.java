package io.streams;
import static io.streams.Display.print;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arr=Arrays.asList("a","a","a");
		List<String> newlist=arr.stream().distinct().collect(Collectors.toList());
		print("distinct list:");
		System.out.println(newlist);
	}
}
