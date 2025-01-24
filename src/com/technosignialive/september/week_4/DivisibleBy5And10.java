package com.technosignialive.september.week_4;

import java.util.Scanner;

public class DivisibleBy5And10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num to check div by 5 and 10");
        int num = sc.nextInt();
        if (num % 10 == 0) {
            System.out.println("Div by both 5 and 10");
        } else {
            System.out.println("Not div");
        }
    }
}
