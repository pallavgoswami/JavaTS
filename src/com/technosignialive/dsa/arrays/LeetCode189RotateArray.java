package com.technosignialive.dsa.arrays;

import java.util.Arrays;

public class LeetCode189RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 4;
        System.out.println(Arrays.toString(rotate(arr, k)));
    }

    public static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, n - 1);
        return arr;
    }

    public static void reverseArray(int[] arr, int start , int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
