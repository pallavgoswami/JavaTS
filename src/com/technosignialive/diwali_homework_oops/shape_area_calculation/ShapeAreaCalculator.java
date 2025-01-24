package com.technosignialive.diwali_homework_oops.shape_area_calculation;

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        // instances of each shape
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(5, 4);
        Shape triangle = new Triangle(5, 3);

        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(triangle.area());
    }
}
