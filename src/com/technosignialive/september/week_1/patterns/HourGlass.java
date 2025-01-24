package com.technosignialive.september.week_1.patterns;

import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number for the hourglass size: ");
        int n = sc.nextInt();
        sc.close();

        // Upper half of hourglass
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < i; j++)
                System.out.print(" "); // Print leading spaces

            for (int j = 0; j < n - 2 * i; j++) {
                if (j == 0 || j == n - 2 * i - 1)
                    System.out.print("*"); // Print stars at edges
                else
                    System.out.print(" "); // Print spaces in between
            }
            System.out.println();
        }

        // Lower half of hourglass
        for (int i = n / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++)
                System.out.print(" "); // Print leading spaces

            for (int j = 0; j < n - 2 * i; j++) {
                if (j == 0 || j == n - 2 * i - 1)
                    System.out.print("*"); // Print stars at edges
                else
                    System.out.print(" "); // Print spaces in between
            }
            System.out.println();
        }
    }
}

