package com.technosignialive.november.multithreading;

interface Printable {
    void print(String doc, String name);
}

class Printer implements Printable {
    @Override
    public void print(String doc, String name) {
        synchronized (Printer.class) {
            System.out.println("Started printing "+ doc +" of "+ name);
            for (int i = 1; i < 10; i++) {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {

                }
                System.out.println(Thread.currentThread().getId() + " is printing " + doc);
            }
            System.out.println(Thread.currentThread().getId() + " is finished printing " + doc + " of " + name);
        }
    }
}
