package com.technosignialive.november.multithreading;

class Student extends Thread {
    Printer printer;
    String document;
    String name;
    Student(Printer printer, String document, String name) {
        this.printer = printer;
        this.document = document;
        this.name = name;
    }
    public void run() {
        printer.print(document, name);
    }
}


