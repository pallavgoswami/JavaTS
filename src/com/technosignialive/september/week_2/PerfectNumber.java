package com.technosignialive.september.week_2;

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 27;
        int divisorSum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                divisorSum += i;
            }
        }
        if (divisorSum == num) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
    }
}
