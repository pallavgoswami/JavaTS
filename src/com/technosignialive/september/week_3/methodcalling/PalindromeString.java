package com.technosignialive.september.week_3.methodcalling;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check palindrome or not");
        String s = sc.next();
        PalindromeString ps = new PalindromeString();
        ps.isPalindromeString(s);
    }

    void isPalindromeString(String s) {
        String temp = "";
        int n = s.length();
        for (int i = n - 1; i >= 0 ; i--) {
            temp += s.charAt(i);
        }
        if (temp.equals(s)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
    }
}
