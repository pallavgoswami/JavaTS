package com.technosignialive.dsa.arrays;

public class MinimumElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 7, 8, 8, 65};
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        System.out.println(minimum);
    }
}
