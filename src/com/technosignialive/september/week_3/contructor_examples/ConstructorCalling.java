package com.technosignialive.september.week_3.contructor_examples;

public class ConstructorCalling {
    // this() -> current class constructor
    // super() -> parent class constructor
    public static void main(String[] args) {
        C c1 = new C();
        }
}

class A {
    A() {
        System.out.println("A");
    }
}

class B extends A {
    B() {
        System.out.println("B");
    }
    B(String a) {
        System.out.println("A");
    }
}

class C extends B {
    C() {
        this(20);
        System.out.println("C");
    }
    C(int a) {
        super("A");
        System.out.println("C = " + a);
    }
}
