package com.technosignialive.dsa.arrays;

public class PrimeNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 4, 13, 17};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1) {
                System.out.println(arr[i]);
            }
            int count = 0;
            for (int j = 1; j <= arr[i]; j++) {
                    if (arr[i] % j == 0) {
                        count++;
                    }
                }
            if (count == 2) {
                System.out.println(arr[i]);
            }
        }
    }
}
