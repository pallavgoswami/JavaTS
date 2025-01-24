package com.technosignialive.november.exception_handling;

public class ArithmeticEx {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;
        int c = 0;
        try {
            c = a / b;
        } catch (java.lang.ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c);
        System.out.println("Program Continues");
    }
}
