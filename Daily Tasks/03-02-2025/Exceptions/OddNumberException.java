package Exceptions;

public class OddNumberException {
 public static void checkEven(int num) throws Exception {
     if (num % 2 != 0) {
         throw new Exception("Number is odd");
     }
     System.out.println("Number is even");
 }
 public static void main(String[] args) {
     try {
         checkEven(5);
     } catch (Exception e) {
         System.out.println("Exception caught: " + e.getMessage());
     }
 }
}
