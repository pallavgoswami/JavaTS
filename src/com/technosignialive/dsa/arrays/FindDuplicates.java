package com.technosignialive.dsa.arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2, 4, 5, 6, 2};
        findAllDuplicates(arr);
    }

    public static void findAllDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet();
        Set<Integer> duplicates = new HashSet();

        for (int num : arr) {
            if (!seen.add(num)) { // If the number is already in the set, it's a duplicate
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate numbers: " + duplicates);
    }
}
