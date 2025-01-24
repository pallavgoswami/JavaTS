package com.technosignialive.september.week_1.logical;

public class Test {

    public static void m1(int... x) { // used 1D array internally and given the least priority
        System.out.println("var arg method");
    }
    public static void m1(int x) {

    }
    public static void m1(int x, int y) {

    }


    public static void main(String[] args) {
        m1();
        m1(10);
        m1(10, 20);
    }

    // why main method is public?
    // because JVM can access the main method from anywhere

    // why main method is a static method?
    // because there is no need to create the object of the class to call the main method. If main method was non-static method, then JVM would need to create the instance (object) of the class and allocate the memory before calling the main method.

    // why main method's return type is void?
    // because JVM doesn't want anything in return from the main method

    // can we change the name of the main method?
    // No

    // what is the parameter of main method?
    // String[] args

    // what is args?
    // It is a variable name which can be changed

    // In how many ways we can write the main method?
    // public static void main(String[] args)
    // static public void main(String[] args)
    // public static void main(String args[])
    // public static void main(String... args) // vararg (variable argument)

    // modifiers that we can use with main method
    // synchronised final strictfp static public void main(String[] args) - strict floating point - thread safety (multithreading)
}
