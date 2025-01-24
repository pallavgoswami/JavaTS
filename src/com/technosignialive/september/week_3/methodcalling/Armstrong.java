package com.technosignialive.september.week_3.methodcalling;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check Armstrong or not");
        int n = sc.nextInt();
        Armstrong a = new Armstrong();
        a.isArmstrong(n);
    }

    void isArmstrong(int n) {
        int temp = n;
        int digitCount = 0;
        while (temp > 0) {
            temp = temp / 10;
            digitCount++;
        }
        temp = n;

        double sum = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, digitCount);
            temp = temp / 10;
        }
        if (sum == n) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not Armstrong");
        }
    }
}
