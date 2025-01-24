package com.technosignialive.november.collection_framework;

import java.util.Arrays;
import java.util.List;

public class CityLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("USA", "Pakistan", "India", "UK");
        for (String country : list) {
            if (country.length() > 3) {
                System.out.println(country);
            }
        }
    }
}


// write a program to print average of all the number present in a string
// wap to print city name with longest string