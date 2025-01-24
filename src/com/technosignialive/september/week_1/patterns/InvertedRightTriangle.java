package com.technosignialive.september.week_1.patterns;

public class InvertedRightTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
