package Threads;

import java.util.Arrays;

class MatrixMultiplicationThread extends Thread {
 private int[][] A, B, result;
 private int row, col, size;

 public MatrixMultiplicationThread(int[][] A, int[][] B, int[][] result, int row, int col, int size) {
     this.A = A;
     this.B = B;
     this.result = result;
     this.row = row;
     this.col = col;
     this.size = size;
 }

 public void run() {
     for (int i = 0; i < size; i++) {
         result[row][col] += A[row][i] * B[i][col];
     }
 }
}

public class MultiThreadMatrixMultiplication {
 public static void main(String[] args) throws InterruptedException {
     int[][] A = {{1, 2}, {3, 4}};
     int[][] B = {{5, 6}, {7, 8}};
     int[][] result = new int[2][2];

     Thread[][] threads = new Thread[2][2];

     for (int i = 0; i < 2; i++) {
         for (int j = 0; j < 2; j++) {
             threads[i][j] = new MatrixMultiplicationThread(A, B, result, i, j, 2);
             threads[i][j].start();
         }
     }

     for (int i = 0; i < 2; i++) {
         for (int j = 0; j < 2; j++) {
             threads[i][j].join();
         }
     }

     for (int[] row : result) {
         System.out.println(Arrays.toString(row));
     }
 }
}
