package collections;
import java.util.ArrayList;

public class CopyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> originalList = new ArrayList<>();
        originalList.add(10);
        originalList.add(20);
        originalList.add(30);
        originalList.add(40);
        System.out.println("Original ArrayList: " + originalList);
        ArrayList<Integer> copiedList = new ArrayList<>(originalList);
        System.out.println("Copied ArrayList: " + copiedList);
    }
}
