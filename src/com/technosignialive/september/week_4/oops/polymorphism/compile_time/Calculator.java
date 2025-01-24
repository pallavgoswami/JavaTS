package com.technosignialive.september.week_4.oops.polymorphism.compile_time;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Main 1");
        Calculator c1 = new Calculator();
        c1.add(1, 2);
        c1.add(1, 2, 4);
    }

    // two main methods but diff parameters
    public static void main(String args) {
        System.out.println("Hello Java");
    }


    static void add(int a, int b) {
        System.out.println(a + b);
    }

    static void add(int a , int b, int c) {
        System.out.println(a + b + c);
    }
}
