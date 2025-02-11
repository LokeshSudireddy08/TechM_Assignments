package collections;
import java.util.*;
class removethirdelement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Purple"));
        System.out.println("Original List: " + colors);
        if (colors.size() > 2) {
            colors.remove(2);
            System.out.println("Updated List after removing third element: " + colors);
        } else {
            System.out.println("List does not have a third element to remove.");
        }
    }
}
