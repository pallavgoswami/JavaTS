package com.technosignialive.september.week_1.patterns;

public class InvertedTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" " + " ");
            }
            for (int k = 1; k <= 7 - 2 * i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
