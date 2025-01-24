package com.technosignialive.dsa.arrays;
// sum of main and secondary diagonal
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 4},
                          {5, 6, 7},
                          {8, 9, 10}};
        MatrixDiagonalSum m1 = new MatrixDiagonalSum();
        System.out.println(m1.diagonalSum(matrix));
    }

     int diagonalSum(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            sum += matrix[i][n - i - 1];
        }
        if (n % 2 != 0) {
            sum -= matrix[n / 2][n / 2]; // n/2 ensures that middle element is subtracted from the entire sum when matrix is odd.
        }
        return sum;
    }
}
