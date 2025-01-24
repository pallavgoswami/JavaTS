package com.technosignialive.dsa.arrays;

import java.util.Arrays;

public class LeftShift {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7};
        int firstElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = firstElement;
        System.out.println(Arrays.toString(arr));
    }
}
