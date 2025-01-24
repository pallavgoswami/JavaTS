package com.technosignialive.diwali_homework_oops.shape_area_calculation;
// 5.	Shape Area Calculation
//	•	Design a class hierarchy where Shape is the base class with a method area().
//	Derive classes Circle, Rectangle, and Triangle that override the area() method to calculate the area based on specific shapes.
abstract class Shape {
    abstract double area();
}


class Circle extends Shape {
    private double radius;

    // constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //override area method
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private int length, breadth;

    // constructor
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // override area method
    @Override
    double area() {
        return length * breadth;
    }
}

class Triangle extends Shape {
    private int base, height;

    // constructor
    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    // override area method
    @Override
    double area() {
        return 0.5 * base * height;
    }
}


