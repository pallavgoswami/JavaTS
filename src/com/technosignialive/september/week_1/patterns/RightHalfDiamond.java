package com.technosignialive.september.week_1.patterns;

public class RightHalfDiamond {
    public static void main(String[] args) {
        int row = 3;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = 2; i <= row; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
