package com.technosignialive.september.week_2;

public class Neon {
    public static void main(String[] args) {
        int num = 9;
        int product = num * num;
        int sum = 0;
        while (num != 0) {
            int lastDigit = product % 10;
            product = product / 10;
            sum = sum + lastDigit;
        }
        if (sum == num) {
            System.out.println("Neon");
        } else {
            System.out.println("Not Neon");
        }
    }
}
