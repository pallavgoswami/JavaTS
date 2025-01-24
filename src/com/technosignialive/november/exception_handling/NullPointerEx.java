package com.technosignialive.november.exception_handling;

import java.util.Scanner;

public class NullPointerEx {
    public static void main(String[] args) {
        String str = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = sc.next();

        try {
            if (str.equals(input)) {
                System.out.println("String is equal");
            } else {
                System.out.println("String is not equal");
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Program Continues");
    }
}
