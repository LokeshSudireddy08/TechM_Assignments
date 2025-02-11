package collections;

import java.util.*;
public class insertatfirst {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        System.out.println(colors);
        colors.add(0,"Black");
        System.out.println(colors);
    }
}
