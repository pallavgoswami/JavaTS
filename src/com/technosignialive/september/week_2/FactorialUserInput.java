package com.technosignialive.september.week_2;

import java.util.Scanner;

public class FactorialUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print it's factorial");
        int input = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= input; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
