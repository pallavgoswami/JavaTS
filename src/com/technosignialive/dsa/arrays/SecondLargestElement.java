package com.technosignialive.dsa.arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {0, -3, -2, -5, 4, 2, 16, 34, 28};
        int largest = Integer.MIN_VALUE;
        int secondLargest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
