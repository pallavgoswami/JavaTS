package com.technosignialive.september.week_3;

public class ZeroPresent {
    public static void main(String[] args) {
        int num = 48;
        int temp = num;
        int count = 0;
        while (temp != 0) {
            int lastDigit = temp % 10;
            temp = temp / 10;
            if (lastDigit == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Zero not Present");
        } else {
            System.out.println("Zero Present");
        }
    }
}
