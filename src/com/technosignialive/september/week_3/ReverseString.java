package com.technosignialive.september.week_3;

public class ReverseString {
    public static void main(String[] args) {
        String s = "abba";
        String rev = "";
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
        if (s.equals(rev)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
