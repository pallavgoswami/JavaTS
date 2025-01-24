package com.technosignialive.september.week_4.oops.polymorphism.run_time;

public class BankingApp {
    public static void main(String[] args) {
        RBIBank b1 = new HDFC(); // upcasting
        System.out.println(b1.getROI());

        b1 = new SBI();
        System.out.println(b1.getROI());
        // b1 is a reference variable
    }
}
