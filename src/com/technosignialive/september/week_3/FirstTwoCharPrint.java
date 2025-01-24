package com.technosignialive.september.week_3;

public class FirstTwoCharPrint {
    public static void main(String[] args) {
        String s = "We are Indians";
        s += ' ';
        String w = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                w += c;
            } else {
                System.out.println(w.substring(0, 2));
                w = "";
            }
        }
    }
}
