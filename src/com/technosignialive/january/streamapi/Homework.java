package com.technosignialive.january.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Homework {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 34, 56, 7, 81, 2, 89);

        // Count odd numbers
        long oddCount = list.stream().filter(ele -> ele % 2 != 0).count();

        // List of squares of each number
        List<Integer> squares = list.stream().map(ele -> ele * ele).collect(Collectors.toList());

        // List of squares sorted in ascending order
        List<Integer> sortedSquares = list.stream()
                .map(ele -> ele * ele)
                .sorted()
                .collect(Collectors.toList());

        // List of String numbers to Integer
        List<String> list1 = Arrays.asList("12", "34", "56", "77", "44", "89");
        List<Integer> numbers = list1.stream().map(ele -> Integer.parseInt(ele)).toList();


        // Print results
        System.out.println("Original List: " + list);
        System.out.println("Count of Odd Numbers: " + oddCount);
        System.out.println("Squares of Each Number: " + squares);
        System.out.println("Sorted Squares in Ascending Order: " + sortedSquares);
    }
}
