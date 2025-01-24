package com.technosignialive.september.week_2;

public class IsPrime1 {
    public static void main(String[] args) {
        int num = 15;
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }
    }
}
