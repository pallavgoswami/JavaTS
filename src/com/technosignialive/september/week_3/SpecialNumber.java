package com.technosignialive.september.week_3;

public class SpecialNumber {
    public static void main(String[] args) {
        int num = 1233;
        int temp = num;
        int sum = 0;
        int product = 1;
        while (temp != 0) {
            int lastDigit = temp % 10;
            sum += lastDigit;
            product *= lastDigit;
            temp /= 10;
        }
        if (sum + product == num) {
            System.out.println("Special Number");
        } else {
            System.out.println("Not a Special Number");
        }
    }
}
