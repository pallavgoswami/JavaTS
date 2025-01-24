package com.technosignialive.september.week_4.oops.abstraction;

public interface Printer {
    void print();
}

class ColourPrinter implements Printer {
    public void print() {
        System.out.println("Printing Colour Papers...");
    }
}

class BlackAndWhitePrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing BlackAndWhite Papers...");
    }
}

class JumboPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing Jumbo Papers...");
    }
}

// 1.7
// 100% abstraction
// We can't instantiate
// Doesn't contain constructor
