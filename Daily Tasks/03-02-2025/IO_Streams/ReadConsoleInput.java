package IO_Streams;

import java.util.Scanner;

public class ReadConsoleInput {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter input: ");
     String input = sc.nextLine();
     System.out.println("You entered: " + input);
 }
}
