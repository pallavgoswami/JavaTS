package com.technosignialive.september.week_3.methodcalling;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check Palindrome or not");
        int n = sc.nextInt();
        Palindrome p = new Palindrome();
        p.isPalindrome(n);
    }

    void isPalindrome(int n) {
        int temp = n;
        int rev = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            rev = rev * 10 + lastDigit;
            temp = temp / 10;
        }
        if (rev == n) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome Number");
        }
    }
}
