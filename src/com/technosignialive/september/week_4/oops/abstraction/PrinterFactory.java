package com.technosignialive.september.week_4.oops.abstraction;

public class PrinterFactory {
    public static Printer getInstance(String printerType) {
        if (printerType.equalsIgnoreCase("ColourPrinter")) {
            return new ColourPrinter();

        } else if (printerType.equalsIgnoreCase("BlackAndWhitePrinter")) {
            return new BlackAndWhitePrinter();

        } else if (printerType.equalsIgnoreCase("JumboPrinter")) {
            return new JumboPrinter();

        } else {
            return null;
        }
    }

}
