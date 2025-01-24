package com.technosignialive.dsa.arrays;

public class PrimeNumber1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 7, 13, 17};
        for (int i = 0; i < arr.length; i++) {
            checkPrime(arr[i]);
        }
    }

    public static void checkPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(n);
        }
    }
}
