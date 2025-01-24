package com.technosignialive.january.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 34, 56, 7, 81, 2, 89);
        Predicate<Integer> evenFilter = (e) -> e % 2 == 0;
        List<Integer> evens = list.stream().filter(ele -> ele % 2 == 0).toList();
        list.stream().map(ele -> ele * ele).forEach(ele -> System.out.println(ele));
        long count = list.stream().filter(ele -> ele % 2 != 0).count();

        System.out.println("Original List: " + list);
        System.out.println("Even List " + evens);
    }
}





// count odd number present in given list
// wap to make square of each number in list
// wap to make square of each number and sort the list in ascending order