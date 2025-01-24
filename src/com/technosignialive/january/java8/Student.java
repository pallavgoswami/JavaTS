package com.technosignialive.january.java8;

public class Student implements Cloneable{
    int rollNo;
    Student(int rollNo) {
        this.rollNo = rollNo;
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        Student s1 = new Student(101);
        Student s2 = (Student) s1.clone();  // down casting: storing parent class object in child class
        Student s3 = new Student(102);

        System.out.println(s1.rollNo);
        System.out.println(s2.rollNo);
        System.out.println(s3.rollNo);

        System.out.println(s1);
        System.out.println(s2);
    }

}
