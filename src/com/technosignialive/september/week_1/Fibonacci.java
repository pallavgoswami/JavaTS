package com.technosignialive.september.week_1;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }

    static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
