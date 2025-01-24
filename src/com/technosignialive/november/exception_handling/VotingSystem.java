package com.technosignialive.november.exception_handling;

import java.util.Scanner;

public class VotingSystem {
    public static void main(String[] args) {
        VotingSystem v1 = new VotingSystem();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        v1.validateVoter(age);
    }

    void validateVoter(int age) {
        if (age >= 18) {
            System.out.println("Welcome to voting system");
        } else {
            throw new InvalidVoterException("can't cast your vote"); // calls exception class if there exists any
            // since we have created this explicitly
        }
    }
}
