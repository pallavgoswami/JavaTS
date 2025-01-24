package com.technosignialive.november.exception_handling;

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        validateVoter(sc.nextInt());
    }

    static void validateVoter(int age) {
        if (age >= 18) {
            System.out.println("Welcome to voting system");
        } else {
            throw new ArithmeticException("can't cast your vote");
        }
    }
}
