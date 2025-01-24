package com.technosignialive.september.week_3;

public class Palindrome {
    public static void main(String[] args) {
        revNum();
        revString();
    }

    public static void revNum() {
        int num = 12456;
        int rev = num;
        int revNum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num = num / 10;
            revNum = revNum * 10 + lastDigit;
        }
        System.out.println(revNum);
        if (revNum == num) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void revString() {
        String s = "akjfjadkhf";
        String rev = "";
        int n = s.length();
        for (int i = n - 1; i >= 0 ; i--) {
            rev += s.charAt(i);
        }
        System.out.println(rev);
        if (s.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
