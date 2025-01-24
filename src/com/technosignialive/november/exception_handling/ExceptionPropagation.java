package com.technosignialive.november.exception_handling;

import java.io.IOException;

public class ExceptionPropagation {
    public static void main(String[] args) {
        EvCar.start();
    }
}

class Vehicle {
    static void start() throws IOException {
        int maxSpeed = 100;
        int avgSpeed = 0;
        throw new IOException("Exception");
    }
}

class Car extends Vehicle {
    static void start() {
        try {
            Vehicle.start();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Car");
    }
}

class EvCar extends Vehicle {
    static void start() {
        Car.start();
        System.out.println("EvCar");
    }
}


