package com.technosignialive.september.week_3;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check +ve or -ve");
        int input = sc.nextInt();
        if (input > 0) {
            System.out.println("+ve number");
        } else if (input == 0) {
            System.out.println("non -ve/unsigned number");
        } else {
            System.out.println("-ve Number");
        }

    }
}
