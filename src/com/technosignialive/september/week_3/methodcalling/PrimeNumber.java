package com.technosignialive.september.week_3.methodcalling;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check prime or not");
        int n = sc.nextInt();
        PrimeNumber p = new PrimeNumber();
        p.isPrime(n);
    }

    void isPrime(int n) {
        int count = 0;
        if (n <= 1) {
            System.out.println("Number is not Prime");
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Number is not Prime");
        } else {
            System.out.println("Number is Prime");
        }
    }
}

