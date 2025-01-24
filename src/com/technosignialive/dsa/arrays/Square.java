package com.technosignialive.dsa.arrays;

public class Square {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7};
        for (int i = 0; i < arr.length; i++) {
            int square = arr[i] * arr[i];
            System.out.println(square);
        }
    }
}
