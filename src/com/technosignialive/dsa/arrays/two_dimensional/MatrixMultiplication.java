package com.technosignialive.dsa.arrays.two_dimensional;

public class MatrixMultiplication {
    public static void main(String[] args) {
        // Matrix A (2x2)
        int[][] A = {
                {1, 9},
                {-2, 3}
        };

        // Matrix B (2x2)
        int[][] B = {
                {-3, 4},
                {1, 5}
        };

        // Result matrix to store the multiplication result
        int[][] result = new int[2][2];

        // Performing matrix multiplication
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = 0; // Initialize result[i][j] to 0
                for (int k = 0; k < 2; k++) {
                    result[i][j] += A[i][k] * B[k][j]; // Multiply and sum the results
                }
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

