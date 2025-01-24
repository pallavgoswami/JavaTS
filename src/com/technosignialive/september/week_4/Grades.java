package com.technosignialive.september.week_4;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks to check grades");
        int marks = sc.nextInt();
        if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 80) {
            System.out.println("B");
        } else if (marks >= 50) {
            System.out.println("C");
        } else if (marks >= 30) {
            System.out.println("D");
        } else {
            System.out.println("FAIL");
        }
    }
}
