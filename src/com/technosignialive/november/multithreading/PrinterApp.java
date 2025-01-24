package com.technosignialive.november.multithreading;

public class PrinterApp {
    public static void main(String[] args) {
        Printer sharedPrinter = new Printer();
        Student s1 = new Student(sharedPrinter, "Resume", "Smith");
        Student s2 = new Student(sharedPrinter, "Resume", "John");
        Student s3 = new Student(sharedPrinter, "Resume", "Virat");
        s1.start();
        s2.start();
        s3.start();
    }
}
