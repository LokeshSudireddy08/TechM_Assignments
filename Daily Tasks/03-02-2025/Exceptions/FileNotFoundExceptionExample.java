package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExceptionExample {
 public static void readFile(String path) throws FileNotFoundException {
     File file = new File(path);
     Scanner scanner = new Scanner(file);
     while (scanner.hasNextLine()) {
         System.out.println(scanner.nextLine());
     }
     scanner.close();
 }

 public static void main(String[] args) {
     try {
         readFile("C:\\Users\\LOKESH\\eclipse-workspace\\lokesh\\sample.txt");
     } catch (FileNotFoundException e) {
         System.out.println("Exception caught: File not found");
     }
 }
}
