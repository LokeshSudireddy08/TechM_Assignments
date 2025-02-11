package collections;
import java.util.*;
class RetrieveElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Purple"));
        int index = 2; 
        if (index >= 0 && index < colors.size()) {
            System.out.println("Element at index " + index + ": " + colors.get(index));
        } else {
            System.out.println("Invalid index");
        }
    }
}
