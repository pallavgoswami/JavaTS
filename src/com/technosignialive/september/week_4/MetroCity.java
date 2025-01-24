package com.technosignialive.september.week_4;

import java.util.Scanner;

public class MetroCity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a city to check metro or not");
        String cityName = sc.next();
        if (cityName.equalsIgnoreCase("Pune")) {
            System.out.println(cityName + " is Metro city...");
        } else if (cityName.equalsIgnoreCase("Nashik")) {
            System.out.println(cityName + " is Metro city...");
        } else if (cityName.equalsIgnoreCase("Mumbai")) {
            System.out.println(cityName + " is Metro city...");
        } else if (cityName.equalsIgnoreCase("Nagpur")) {
            System.out.println(cityName + " is Metro city...");
        } else {
            System.out.println(cityName + " is not Metro city...");
        }
    }
}
