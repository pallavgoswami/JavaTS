package com.technosignialive.september.week_4.oops.polymorphism.run_time;

public class App {
    public static void main(String[] args) {
        Vehicle v1 = new Bike(); // upCasting
        v1.start();
    }
}


class Vehicle {
    public void start() {
        System.out.println("Vehicle is started");
    }
}

class Car extends Vehicle {
    public void start() {
        System.out.println("Car is started");
    }
}

class Bike extends Vehicle {
    public void start() {
        System.out.println("Bike is started");
    }
}
