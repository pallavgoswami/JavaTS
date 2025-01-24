package com.technosignialive.dsa.arrays;

import java.util.Arrays;

public class LeftShiftByK {
    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 5, 6, 7, 89, 9};
        leftShift(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    public static void leftShift(int[] arr, int k) {
        int n = arr.length;
        if (n == 0 || k == 0) {
            return;
        }
        k = k % n; // Normalize k if it's larger than array length
        int[] temp = new int[k];

        // Copy first k elements to temporary array
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // Shift the rest of the array to the left by k positions
        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }

        // Move the k elements from temp to the end of the array
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }
}
