package com.technosignialive.september.week_1.patterns;

public class RightTriangle {
    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
