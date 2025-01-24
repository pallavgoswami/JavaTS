package com.technosignialive.dsa.strings;

public class Compression {
    public static void main(String[] args) {
        String str = "aabbdddfff";
        String compressed = compress(str);
        System.out.println("Compressed String: " + compressed);
    }

    public static String compress(String str) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        result.append(str.charAt(str.length() - 1)).append(count);

        return result.length() < str.length() ? result.toString() : str;
    }
}
