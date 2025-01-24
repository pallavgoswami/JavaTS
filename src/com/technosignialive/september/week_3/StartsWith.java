package com.technosignialive.september.week_3;

public class StartsWith {
    public static void main(String[] args) {
        String s = "We are Indians and speak Italian";
        s += ' ';
        String w = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                w += c;
            } else {
                if (w.startsWith("I")){
                    System.out.println(w);
                }
                w = "";
            }
        }
    }
}
