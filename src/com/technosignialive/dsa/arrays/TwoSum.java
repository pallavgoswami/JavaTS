package com.technosignialive.dsa.arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(arr, target);
        if (result.length == 0) {
            System.out.println("No indices");
        } else {
            System.out.println("Indices are: " + result[0] + ", " + result[1]);
        }
    }

    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
