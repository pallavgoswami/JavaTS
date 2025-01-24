package com.technosignialive.dsa.strings;

public class Anagram1 {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";

        if (isAnagram(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] count = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}
