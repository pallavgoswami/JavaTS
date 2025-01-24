package com.technosignialive.dsa.arrays;

public class SecondMinimumElement {
    public static void main(String[] args) {
        int[] arr = {1, 12, 33, 44, 5, 6};
        int minimum = Integer.MAX_VALUE;
        int secondMinimum = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimum) {
                secondMinimum = minimum;
                minimum = arr[i];
            } else if (arr[i] < minimum && arr[i] > secondMinimum) {
                secondMinimum = arr[i];
            }
        }
        System.out.println(secondMinimum);
    }
}
