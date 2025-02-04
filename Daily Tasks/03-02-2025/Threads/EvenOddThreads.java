package Threads;

//2. Two threads to print even and odd numbers from 1 to 20
class EvenThread extends Thread {
 public void run() {
     for (int i = 2; i <= 20; i += 2) {
         System.out.println("Even: " + i);
     }
 }
}

class OddThread extends Thread {
 public void run() {
     for (int i = 1; i <= 20; i += 2) {
         System.out.println("Odd: " + i);
     }
 }
}

public class EvenOddThreads {
 public static void main(String[] args) {
     EvenThread even = new EvenThread();
     OddThread odd = new OddThread();
     even.start();
     odd.start();
 }
}
