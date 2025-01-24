package com.technosignialive.november.exception_handling;

import java.util.Scanner;

public class FinallyEx {
    public static void main(String[] args) {
        String str = null;
        Scanner sc = new Scanner(System.in); // Resource leak: 'sc' is never closed
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
        } finally {
            System.out.println("Finally Block");
            sc.close();
        }
        System.out.println("Program Continues");
    }
}
