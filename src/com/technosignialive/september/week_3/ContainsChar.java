package com.technosignialive.september.week_3;

public class ContainsChar {
    public static void main(String[] args) {
        String s = "We are Indians and speak Italian more";
        s += ' ';
        String w = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                w += c;
            } else {
                if (w.contains("ea")){
                    System.out.println(w);
                }
                w = "";
            }
        }
    }
}
