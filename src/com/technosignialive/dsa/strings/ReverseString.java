package com.technosignialive.dsa.strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Welcome";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }
    }
}
