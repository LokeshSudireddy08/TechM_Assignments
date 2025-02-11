package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class printArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arr=new ArrayList<>();
		arr.add("red");
		arr.add("green");
		arr.add("violet");
		arr.add("indigo");
		System.out.println(arr);
		Iterator<String> itr=arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
