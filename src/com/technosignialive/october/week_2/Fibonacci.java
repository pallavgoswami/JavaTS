package com.technosignialive.october.week_2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num to print fibonacci series");
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
