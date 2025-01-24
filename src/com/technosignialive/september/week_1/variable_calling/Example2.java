package com.technosignialive.september.week_1.variable_calling;

public class Example2 {
    char grade = 'A';
    static long mobileNumber = 8888888888l;

    public static void main(String[] args) {
        // static variables
        System.out.println(mobileNumber); // direct access
        System.out.println(Example1.salary); // used class name

        int[] arr = {40000};

        // non-static variables
        Example2 e = new Example2(); // object needs to be created
        System.out.println(e.grade);
        Example1 a = new Example1(); // object needs to be created
        System.out.println(a.marks);
    }

    // how to access same class variables in main method which is static method
    // static variable == direct access
    // non static variable == object creation needs to be done


    // how to access other class variables in main method which is static method
    // static variable == using class name
    // non static variable == object creation
}
