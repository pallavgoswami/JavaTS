package com.technosignialive.september.week_2;

public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int temp = num; // for comparison at the end
        int sum = 0;
        while (num != 0) {
            int digit = num % 10; // last digit
            sum = sum + digit * digit * digit;
            num = num / 10;
        }
        if (sum == temp) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
