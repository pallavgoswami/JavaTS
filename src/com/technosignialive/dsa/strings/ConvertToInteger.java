package com.technosignialive.dsa.strings;

import java.util.Arrays;

public class ConvertToInteger {
    public static void main(String[] args) {
        String[] arr = {"12", "24", "56er", "89"};
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            try {
                ans[i] = Integer.parseInt(arr[i]);
            } catch (NumberFormatException e) {
                System.out.println("One of the strings could not be converted");
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}


