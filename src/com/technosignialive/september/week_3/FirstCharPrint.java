package com.technosignialive.september.week_3;

public class FirstCharPrint {
    public static void main(String[] args) {
        String s = "i am indian";
        s += ' ';
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                ans += s.charAt(i);
            } else {
                System.out.println(ans.toUpperCase().charAt(0));
                ans = "";
            }
        }
    }
}
