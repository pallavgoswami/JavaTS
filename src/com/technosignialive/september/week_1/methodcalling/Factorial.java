package com.technosignialive.september.week_1.methodcalling;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        factorial();
    }

    public static void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to see it's factorial value");
        int n = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
