package com.technosignialive.dsa.strings;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "Welcome to India";
        int[] freq = new int[256]; // ASCII characters

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + ": " + freq[i]);
            }
        }
    }
}
