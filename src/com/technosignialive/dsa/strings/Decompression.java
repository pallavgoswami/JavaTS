package com.technosignialive.dsa.strings;

public class Decompression {
    public static void main(String[] args) {
        String str = "a1b2c2d1";
        String decompressed = decompress(str);
        System.out.println("Decompressed String: " + decompressed);
    }

    public static String decompress(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i += 2) {
            char ch = str.charAt(i);
            int count = str.charAt(i + 1) - '0';

            for (int j = 0; j < count; j++) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
