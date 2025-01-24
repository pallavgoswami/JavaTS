package com.technosignialive.diwali_homework_oops.student_management_system;

public class Student {
    private String name;
    private int age;
    private String rollNo;

    public Student(String name, int age, String rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRollNo() {
        return rollNo;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", rollNumber='" + rollNo + "'}";
    }
}
