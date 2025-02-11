package collections;
import java.util.*;
public class UpdateArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Purple"));
        System.out.println("Original List: " + colors);
        int index = 2;
        String newColor = "Black";
        if (index >= 0 && index < colors.size()) {
            colors.set(index, newColor);
            System.out.println("Updated List: " + colors);
        } else {
            System.out.println("Invalid index");
        }
    }
}
