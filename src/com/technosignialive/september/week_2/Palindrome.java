package com.technosignialive.september.week_2;

public class Palindrome {
    public static void main(String[] args) {
        int num = 152;
        int temp = num; // to compare at end
        int sum = 0;
        while (num != 0) {
            int digit = num % 10; // getting last digit
            sum = sum * 10 + digit;
            num = num / 10; // to reduce the number
        }
        if (sum == temp) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
