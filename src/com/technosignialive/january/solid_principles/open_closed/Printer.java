package com.technosignialive.january.solid_principles.open_closed;

interface Printer {
    void print();
}

class ColorPrinter implements Printer {
    public void print() {
        System.out.println("Printing color papers");
    }
}

class BlackAndWhitePrinter implements Printer {
    public void print() {
        System.out.println("Printing black and white printers");
    }
}


