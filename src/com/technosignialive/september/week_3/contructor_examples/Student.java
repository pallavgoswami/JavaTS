package com.technosignialive.september.week_3.contructor_examples;

public class Student {
    int rollNo;      // Properties, Instance Variables
    String name;     // Global Variable, Data Members
    String branch;   // Fields

    Student(int r, String n, String b) { // constructor
        this.rollNo = r; // this.rollNo points to instance variable
        this.name = n;
        this.branch = b;
        // this means current object of current class
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Smith", "IT"); // invoke or calling
        // s1 is reference variable
        Student s2 = new Student(102, "John", "CS");
        System.out.println("RollNo: " +s1.rollNo+", Name: " + s1.name+", Branch: " + s1.branch);
        System.out.println("RollNo: " +s2.rollNo+", Name: " + s2.name+", Branch: " + s2.branch);

    }



    // 1. Default Constructor
    // 2. Parameterized Constructor
}
