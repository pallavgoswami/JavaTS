package com.technosignialive.november.recursion;

public class ReverseString {
    public static void main(String[] args) {
        String str = "manifest"; // tsefinam
        String rev = reverse(str);
        System.out.println("Reversed string: " + rev);
    }

    static String reverse(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}


