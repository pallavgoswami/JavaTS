package com.technosignialive.dsa.arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 7, 8, 8, 65};
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
