package com.technosignialive.dsa.strings;

public class PalindromicString {
    public static void main(String[] args) {
        String str = "welcome";
        String rev = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            rev += str.charAt(i);
        }
        System.out.println(rev);
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
