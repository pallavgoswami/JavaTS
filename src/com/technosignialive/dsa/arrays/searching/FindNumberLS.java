package com.technosignialive.dsa.arrays.searching;

public class FindNumberLS {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        int target = 5;
        boolean isPresent = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                isPresent = true;
                System.out.println(target + " is found at index " + i);
                break;
            }
        }
        if (!isPresent) {
            System.out.println(target + " is not found");
        }
    }
}
