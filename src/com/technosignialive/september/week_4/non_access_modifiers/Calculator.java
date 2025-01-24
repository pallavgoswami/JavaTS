package com.technosignialive.september.week_4.non_access_modifiers;

public class Calculator {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    static void subtract(int a, int b) {
        System.out.println(a - b);
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator(); // calling the default constructor provided by JVM, object cannot be created without calling a constructor
        c1.add(30, 40); // method calling
        Calculator.subtract(40, 30);
        subtract(40, 30); // no need to write class name for static method calling as it already knows what to call but outside a class you need to mention the class name
    }

}
