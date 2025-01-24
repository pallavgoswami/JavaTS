package com.technosignialive.september.week_1.variable_calling;

public class Demo {
    int num1 = 10;
    static int num2 = 20;

    // no need for object creation for a static variable, it can be called directly with class name
    // for a non-static variable, object needs to be created
    // static can be accessed directly within another static

    public static void main(String[] args) {
        System.out.println(num2);
        System.out.println(Example.s2);
        Demo d = new Demo();
        System.out.println(d.num1);

        Example e = new Example();
        System.out.println(e.s1);
    }
}


