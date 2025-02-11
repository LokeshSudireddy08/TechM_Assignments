package sample;
import java.util.*;

public class task3 {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {1, 2, 3};
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.deepEquals(arr1, arr2));
        int[][] arr3 = {{1, 2, 3}, {1, 2, 3}};
        int[][] arr4 = {{1, 2, 3}, {1, 2, 3}};
        System.out.println(Arrays.equals(arr3, arr4));
        System.out.println(Arrays.deepEquals(arr3, arr4));
    }
}
