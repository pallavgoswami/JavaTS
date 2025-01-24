package com.technosignialive.september.week_4.oops.abstraction;

public abstract class Bank {
    void display() { // non-abstract method, method definition
                     // method implementation, method with body
        System.out.println("Bank...");
    }

    abstract float getROI(); //abstract method, unimplemented method, method without body
                             //method declaration
}

class SBI extends Bank {
    float getROI() { // override compulsory
        return 8.5f;
    }
}

class ICICI extends Bank {
    float getROI() { // override compulsory
        return 9.65f;
    }
}



/*
* 1. 0% to 100% abstraction
* 2. We can't instantiate the abstract class / can't create object of abstract class
*
*
*
 */
