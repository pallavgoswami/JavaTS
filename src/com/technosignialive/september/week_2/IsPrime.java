package com.technosignialive.september.week_2;

// num which is only divisible by 1 and itself is a prime number
public class IsPrime {
    public static void main(String[] args) {
        int num = 15;
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
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
