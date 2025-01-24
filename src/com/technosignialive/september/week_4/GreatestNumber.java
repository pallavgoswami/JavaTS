package com.technosignialive.september.week_4;

public class GreatestNumber {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;
        if (a > b || a != b) {
            System.out.println("a is greater than b");
        } else if (b > a || b != a){
            System.out.println("b is greater than a");
        } else {
            System.out.println("a is equal to b");
        }
    }
}
