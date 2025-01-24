package com.technosignialive.dsa.arrays;

import java.util.HashSet;

public class BalancedArray {
    // [2, 5, -5, 3, -2, -3]
    // positive and negative of same number must be present
    public static void main(String[] args) {
        int[] arr = {2, 5, -5, 3, -2, -3};
        if (isBalanced(arr)) {
            System.out.println("Balanced Array");
        } else {
            System.out.println("Unbalanced Array");
        }

    }


    public static boolean isBalanced(int[] arr) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int num : arr) {
            set.add(num);
        }

        for (int num : arr) {
            if (num > 0 && !set.contains(-num)) {
                return false;
            }
        }
        return true;
    }
}
