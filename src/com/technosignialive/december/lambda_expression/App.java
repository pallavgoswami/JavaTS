package com.technosignialive.december.lambda_expression;

public class App {
    public static void main(String[] args) {
        Vehicle v1 = (int speed) -> System.out.println("Car is running at " + speed + "km/hr");
                v1.run(90);
    }
}
