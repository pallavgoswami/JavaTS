package com.technosignialive.september.week_4.oops.inheritance;

public class Showroom {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.start();

        Car c1 = new Car();
        c1.run();
        c1.start(); // child class using properties of parent class

        EvCar ev1 = new EvCar();
        ev1.charge();
        ev1.run();
        ev1.start();
        // multi-level inheritance
    }
}

class Vehicle {
    void start() {
        System.out.println("Vehicle has started");
    }
}

class Car extends Vehicle {
    void run() {
        System.out.println("Vehicle has run");
    }
}

class EvCar extends Car {
    void charge() {
        System.out.println("Vehicle is charging");
    }
}
