package com.technosignialive.dsa.arrays;


import java.util.Arrays;

public class Intersection {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int[] arr1 = {2, 1, 4, 5, 9, 5};
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i] == arr1[j] && !ans.toString().contains(String.valueOf(arr[i]))) {
                    ans.append(arr[i] + " ");
                }
            }
        }
        System.out.println(ans);
    }
}
