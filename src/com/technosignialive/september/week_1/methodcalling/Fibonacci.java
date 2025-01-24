package com.technosignialive.september.week_1.methodcalling;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacci();
    }

    public static void fibonacci() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print fibonacci series up to that number");
        int num = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int sum = 0;
        if (num >= 0) {
            System.out.println(n1);
        }
        if (num >= 1) {
            System.out.println(n2);
        }
        for (int i = 2; i <= num; i++) {
            sum = n1 + n2;
            System.out.println(sum);
            n1 = n2;
            n2 = sum;
        }
    }
}
