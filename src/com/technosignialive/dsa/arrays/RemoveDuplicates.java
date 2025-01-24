package com.technosignialive.dsa.arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 4, 5, 6};
        Arrays.sort(arr);
        // arr[0] is unique by default
        int uniqueElement = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[uniqueElement] = arr[i];
                uniqueElement++;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(arr, uniqueElement)));
    }
}

// copyOf(int[] original, int newLength)
