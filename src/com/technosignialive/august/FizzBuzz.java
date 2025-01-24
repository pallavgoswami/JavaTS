package com.technosignialive.august;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 105; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.println("FizzBuzzBazz");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("FizzBazz");
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("BuzzBazz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 7 == 0) {
                System.out.println("Bazz");
            } else {
                System.out.println(i);
            }
        }
    }
}
