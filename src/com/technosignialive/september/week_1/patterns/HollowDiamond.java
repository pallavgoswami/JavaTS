package com.technosignialive.september.week_1.patterns;

import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows (odd number): ");
        int n = sc.nextInt();
        sc.close();

        int spaces = n / 2;
        int stars = 1;

        // Upper half
        for (int i = 1; i <= n / 2 + 1; i++) {
            for (int j = 1; j <= spaces; j++)
                System.out.print(" ");
            System.out.print("*");
            if (stars > 1) {
                for (int j = 1; j <= stars - 2; j++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
            spaces--;
            stars += 2;
        }

        // Lower half
        spaces = 1;
        stars = n - 2;
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; j <= spaces; j++)
                System.out.print(" ");
            System.out.print("*");
            if (stars > 1) {
                for (int j = 1; j <= stars - 2; j++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
            spaces++;
            stars -= 2;
        }
    }
}
