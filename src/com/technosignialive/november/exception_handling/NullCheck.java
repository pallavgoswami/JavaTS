package com.technosignialive.november.exception_handling;

import java.util.Scanner;

public class NullCheck {
    public static void main(String[] args) {
        String str = null;
        Scanner sc = new Scanner(System.in); // Resource leak: 'sc' is never closed
        System.out.println("Enter a city name");
        String cityName = sc.next();
        if (str != null) {
            if (str.equals(cityName)) {
                System.out.println("both are equal");
            } else {
                System.out.println("both are not equal");
            }
        } else {
            System.out.println("String can't be null");
            sc.close();
        }
        System.out.println("Program continues");
    }
}
