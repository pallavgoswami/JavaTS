package com.technosignialive.september.week_4.oops.abstraction;

import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bankName = "";
        System.out.println("Enter bank name");
        bankName = sc.next();
        Bank b1 = null;

        if (bankName.equals("SBI")) {
            b1 = new SBI();
            System.out.println("SBI ROI: " + b1.getROI());
        } else if (bankName.equals("ICICI")) {
            b1 = new ICICI();
            System.out.println("ICICI ROI: " + b1.getROI());
        } else {
            System.out.println("Please enter correct bank name");
        }
    }
}
