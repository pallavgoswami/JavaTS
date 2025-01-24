package com.technosignialive.september.week_3;

import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check composite or not");
        int n = sc.nextInt();
        int count = 0;
        if (n <= 1) {
            System.out.println("Not composite");
        }
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Composite");
        } else {
            System.out.println("Not Composite");
        }

    }
}
