package com.technosignialive.dsa.strings;

public class Anagram2 {
    public static void main(String[] args) {
        String str = "race";
        String str1 = "care";

        if (str.length() != str1.length()) {
            System.out.println("Not Anagram");
            return;
        }

        int[] charCount = new int[256]; // For ASCII character set

        // Increment count for characters in str
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        // Decrement count for characters in str1
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]--;
        }

        // Check if all counts are zero
        for (int count : charCount) {
            if (count != 0) {
                System.out.println("Not Anagram");
                return;
            }
        }

        System.out.println("Anagram");
    }
}
