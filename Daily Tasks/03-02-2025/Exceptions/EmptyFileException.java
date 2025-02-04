package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EmptyFileException {
 public static void checkEmptyFile(String path) throws Exception {
     File file = new File(path);
     Scanner scanner = new Scanner(file);
     if (!scanner.hasNextLine()) {
         throw new Exception("File is empty");
     }
     while (scanner.hasNextLine()) {
         System.out.println(scanner.nextLine());
     }
     scanner.close();
 }

 public static void main(String[] args) {
     try {
         checkEmptyFile("C:\\Users\\LOKESH\\eclipse-workspace\\lokesh\\empty.txt");
     } catch (Exception e) {
         System.out.println("Exception caught: " + e.getMessage());
     }
 }
}
