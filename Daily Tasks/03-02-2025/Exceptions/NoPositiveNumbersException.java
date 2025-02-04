package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NoPositiveNumbersException {
 public static void checkNumbers(String path) throws Exception {
     File file = new File(path);
     Scanner scanner = new Scanner(file);
     while (scanner.hasNextInt()) {
         int num = scanner.nextInt();
         if (num > 0) {
             throw new Exception("File contains a positive number");
         }
     }
     scanner.close();
     System.out.println("No positive numbers found");
 }

 public static void main(String[] args) {
     try {
         checkNumbers("C:\\Users\\LOKESH\\eclipse-workspace\\lokesh\\numbers.txt");
     } catch (Exception e) {
         System.out.println("Exception caught: " + e.getMessage());
     }
 }
}
