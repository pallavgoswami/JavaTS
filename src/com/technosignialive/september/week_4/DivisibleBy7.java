package com.technosignialive.september.week_4;

import java.util.Scanner;

public class DivisibleBy7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num to check div by 7 or not");
        int inp = sc.nextInt();
        if (inp % 7 == 0) {
            System.out.println("Divisible");
        } else {
            System.out.println("Not Divisible");
        }
    }
}
