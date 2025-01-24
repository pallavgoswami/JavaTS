package com.technosignialive.dsa.arrays;

import java.util.Arrays;

public class ArrayRearrangement {
    // using insertion sort technique
    // negative before positive in the same order
    public static void main(String[] args) {
        int[] arr = {4, 3, -3, -1, -4, 9, 8};
        // answer arr = {-3, -1, -4, 4, 3, 9, 8};
        rotateArray(arr);
        System.out.println(Arrays.toString(arr));
        }


    public static void rotateArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // if we find -ve num
            if (arr[i] < 0) {
                int temp = arr[i];
                int j = i;
                // shift all elements to right until correct position is found
                while (j > 0 && arr[j - 1] >= 0) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                // place -ve num in correct position
                arr[j] = temp;
            }
        }
    }
}
