package com.technosignialive.december;

public class App {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle() {
            @Override
            public void run() {
                System.out.println("Car is running");
            }
        };
        v1.run();
    }
}
