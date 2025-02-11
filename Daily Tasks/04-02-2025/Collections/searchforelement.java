package collections;
import java.util.*;

class searchforelement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Purple"));
        System.out.println("ArrayList: " + colors);
        
        String searchColor = "Blue";  
        if (colors.contains(searchColor)) {
            System.out.println(searchColor + " is found at index " + colors.indexOf(searchColor));
        } else {
            System.out.println(searchColor + " is not found in the list.");
        }
    }
}
