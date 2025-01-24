package com.technosignialive.september.week_3.methodcalling;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print it's factorial");
        int n = sc.nextInt();
        Factorial f = new Factorial();
        System.out.println(f.factorial(n));
    }

    int factorial(int n) {
        int factorial = 1;
        while (n > 0) {
            factorial = factorial * n;
            n--;
        }
        return factorial;
    }
}
