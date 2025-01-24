package com.technosignialive.september.week_1.methodcalling;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        isPrime();
    }

    public static void isPrime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check prime or not");
        int n = sc.nextInt();
        int count = 0;
        if (n <= 1) {
            System.out.println("Not Prime");
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Number is prime");
            } else {
                System.out.println("Number is not prime");
            }
        }

    }
}



