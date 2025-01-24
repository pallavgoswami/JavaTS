package com.technosignialive.september.week_4.non_access_modifiers;

public class StaticBlock {
    static String collegeName;

    static {
        collegeName = "Technosignia";
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }

    // static block is executed "once" before main method
    // Static Block: Used for initializing static variables or performing tasks that need to be done once when the class is loaded.
}

