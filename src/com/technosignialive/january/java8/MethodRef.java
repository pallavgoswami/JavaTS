package com.technosignialive.january.java8;

import java.util.Arrays;
import java.util.List;
// WAP to print country name whose length is <= 3
public class MethodRef {
    public static void display(String name) {
        System.out.println(name);
    }


    public static void main(String[] args) {
        List<String> list = Arrays.asList("India", "USA", "AUS", "UK");
        list.stream().filter(ele -> ele.length() <= 3).forEach(ele -> MethodRef.display(ele));
        list.stream().filter(ele -> ele.length() <= 3).forEach(MethodRef::display); // method reference
        // directly call a method as a variable
    }
}
