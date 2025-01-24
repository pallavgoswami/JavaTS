package com.technosignialive.september.week_3;

public class LineByLineChar {
    public static void main(String[] args) {
        String s = "python";
        int n = s.length() - 1;
        for (int i = 0; i <= n; i++) {
            System.out.println(s.charAt(i));
        }
    }
}
