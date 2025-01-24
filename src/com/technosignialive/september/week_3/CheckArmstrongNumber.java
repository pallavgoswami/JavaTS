package com.technosignialive.september.week_3;

import java.util.Scanner;

public class CheckArmstrongNumber {
    public static void checkArmstrongNumber(int n) {
        int m = n; // temp variable to perform operations
        int digits = 0; // variable to count digits and get power
        double sum = 0; // variable to store power sum
        while (m != 0) {
            m = m / 10; // reducing the number
            digits++;
        }
        System.out.println("digits are " + digits);

        m = n; // resetting m to original number

        while (m > 0) {
            int d = m % 10; // obtaining the last digit
            sum = sum + Math.pow(d, digits);
            m = m / 10;
        }
        if (sum == n) {
            System.out.println("Number is armstrong");
        } else {
            System.out.println("Number is not armstrong");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check armstrong or not");
        int n = sc.nextInt();
        checkArmstrongNumber(n);
    }
}
