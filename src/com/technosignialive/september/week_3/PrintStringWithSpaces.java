package com.technosignialive.september.week_3;

public class PrintStringWithSpaces {
    public static void main(String[] args) {
        String s = "I am Indian";
        s += ' ';
        String w = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                w += c;
            } else {
                System.out.println(w);
                w = "";
            }
        }
    }
}
