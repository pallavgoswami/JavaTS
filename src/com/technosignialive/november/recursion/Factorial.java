package com.technosignialive.november.recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(factorial(n));
    }

     static int factorial(int n) {
        if (n == 1) {
            return n;
        }
        return n * factorial(n - 1);
    }
}

// 5 -> 5 4 3 2 1 -> 120