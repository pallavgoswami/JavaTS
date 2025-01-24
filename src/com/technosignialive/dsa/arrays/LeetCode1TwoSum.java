package com.technosignialive.dsa.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode1TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));

    }

    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            int reqNum = target - arr[i];
            if (map.containsKey(reqNum)) {
                return new int[] {map.get(reqNum), i};
            }
            map.put(arr[i], i);
        }
        return null;
    }
}

// here key is the element of the array
