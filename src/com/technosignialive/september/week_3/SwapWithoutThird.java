package com.technosignialive.september.week_3;

public class SwapWithoutThird {
    public static void main(String[] args) {
        int a = 50;
        int b = 40;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}
