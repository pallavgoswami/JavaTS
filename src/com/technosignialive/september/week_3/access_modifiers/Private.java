package com.technosignialive.september.week_3.access_modifiers;

public class Private {
    private int rollNo;

    Private() {
        System.out.println("Constructor called..."+this.rollNo);
    }
    private void display() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Private p1 = new Private();
        p1.rollNo = 101;
        p1.display();
    }
}
