package com.technosignialive.september.week_4;

import java.util.Scanner;

public class VotingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your nationality");
        String nationality = sc.next();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (nationality.equalsIgnoreCase("Indian") || nationality.equalsIgnoreCase("NRI") && age >= 18) {
            System.out.println("Welcome to voting system");
        } else {
            System.out.println("Not eligible");
        }

    }
}
// WAP to implement voting system, if user is Indian or NRI and age >= 18, he should be eligible
// to vote otherwise he is not eligible to vote.
// e.g.
// Enter your nationality
// Indian / NRI
// Enter your age
// 19
// Welcome to voting system