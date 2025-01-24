package com.technosignialive.january.java8;

interface Vehicle {

    static void run() {
        System.out.println("Vehicle is running....");
    }
    default void start() {
        System.out.println("Vehicle is started.....");
    }
}

interface Engine1  {

    default void start() {
        System.out.println("Engine is started.....");
    }
}

class Car1 implements Vehicle,Engine1{

    public  void start() { //
        Engine1.super.start();
    }

    public void parking() {
        System.out.println("Car is parked");
    }
}

public class ShowRoomApp{

    public static void main(String args[]) {

        Car1 c1 = new Car1();
        c1.parking();
        Vehicle.run();
        c1.start();

    }
}
