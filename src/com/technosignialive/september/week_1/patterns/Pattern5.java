package com.technosignialive.september.week_1.patterns;

public class Pattern5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
