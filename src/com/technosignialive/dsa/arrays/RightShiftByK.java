package com.technosignialive.dsa.arrays;

import java.util.Arrays;

public class RightShiftByK {
    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 5, 6, 7, 89, 9};
        rightShift(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    public static void rightShift(int[] arr, int k) {
        int n = arr.length;
        if (n == 0 || k == 0) {
            return;
        }
        k = k % n;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }
        for (int i = n - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }
}
