package com.technosignialive.dsa.strings;

public class Compression1 {

    static String getCompressedStr(String str) {
        int charcount = 1;
        String compressedStr = "";
        for (int i = 0; i < str.length(); i++) {
            String subStr = "";
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                ++charcount;
            } else {
                subStr = subStr + str.charAt(i) + charcount;
                charcount = 1;
            }
            compressedStr = compressedStr + subStr;
        }

        if (compressedStr.length() < str.length()) {
            return compressedStr;
        } else {
            return str;
        }
    }

    public static void main(String args[]) {

        System.out.println(getCompressedStr("abcdd"));

    }
}
