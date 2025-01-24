package com.technosignialive.september.week_4.non_access_modifiers;

public class Student {
    int rollNo;  // properties, data members, instance variables
    String name; // global variables, fields

    static String collegeName = "Technosignia";

    // in-order to initialise the instance variables we use parameterized constructor

    Student (int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }


    public static void main(String[] args) {
        // storing data -> make object -> parameterized constructor
        Student s1 = new Student(101, "Smith");
        Student s2 = new Student(102, "John");
        // for every student memory will be allocated once each
        // but for college name, memory will be allocated only once as it's static and will be shared

        System.out.println("RollNo: "+s1.rollNo+" Name: "+s1.name+" College:"+Student.collegeName);
        System.out.println("RollNo: "+s2.rollNo+" Name: "+s2.name+" College:"+Student.collegeName);

    }
}

