package com.technosignialive.september.week_3;

public class LineByLinePrint {
    public static void main(String[] args) {
        int num = 123;
        int temp = num;
        while (temp != 0) {
            int lastDigit = temp % 10;
            System.out.println(lastDigit);
            temp /= 10;
        }
    }
}
