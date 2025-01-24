package com.technosignialive.september.week_4.oops.inheritance;

public class App {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.start();
        Truck t1 = new Truck();
        t1.run();
    }
}

class Vehicle1 {
    void display() {
        System.out.println("Vehicle...");
    }
}

class Truck extends Vehicle1 {
    void run() {
        System.out.println("Truck is running...");
    }
}

class Bike extends Vehicle1 {
    void start() {
        System.out.println("Bike is running...");
    }
}
