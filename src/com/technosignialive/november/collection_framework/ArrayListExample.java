package com.technosignialive.november.collection_framework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 45, 67, 12, 45, 87); // readonly
        Set<Integer> set = new HashSet<Integer>();
        set.addAll(list);
        System.out.println(set.size());
        System.out.println(set);

    }
}
