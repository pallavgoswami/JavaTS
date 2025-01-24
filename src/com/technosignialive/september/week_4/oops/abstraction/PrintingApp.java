package com.technosignialive.september.week_4.oops.abstraction;

import java.util.Scanner;

public class PrintingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter printing type...");
        String printerType = sc.next();
        Printer p1 = null;

        p1 = PrinterFactory.getInstance(printerType);

        if (p1 != null) {
            p1.print();
        } else {
            System.out.println("Given printer is not available");
        }

    }
}
