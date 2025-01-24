package com.technosignialive.january.solid_principles.open_closed;

public class PrintingMachine {
    public static void main(String[] args) {
        Printer p1 = new ColorPrinter(); // upcasting
        p1.print();
        p1 = new BlackAndWhitePrinter();
        p1.print();
    }
}
