package collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(12);
        list.add(78);
        list.add(23);
        list.add(56);
        System.out.println("Original ArrayList: " + list);
        Collections.sort(list);
        System.out.println("Sorted ArrayList: " + list);
    }
}
