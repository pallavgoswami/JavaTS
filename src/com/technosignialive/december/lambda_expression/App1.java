package com.technosignialive.december.lambda_expression;

public class App1 {
    public static void main(String[] args) {
        Vehicle v1 = (int a) -> System.out.println("Vehicle is running");
        v1.run(30);

        Runnable r1 = () -> System.out.println("Thread started....");
        Thread t1 = new Thread(r1);
        t1.start();
    }
}
