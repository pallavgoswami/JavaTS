package com.technosignialive.november.collection_framework;

import java.util.Arrays;
import java.util.List;

public class PrintCityName {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Pune", "Patna", "Mumbai", "Latur", "Nashik");
        for (String city : cities) {
            city = city.toLowerCase();
            if (city.startsWith("p")) {
                System.out.println(city);
            }
        }
    }
}
