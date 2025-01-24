package com.technosignialive.january.solid_principles.liskov_sub_principle;

public class BirdApp {
    public static void main(String[] args) {
        Sparrow s1 = new Sparrow();
        s1.fly();
        s1.eat();

        Penguin p1 = new Penguin();
        p1.eat();
        p1.swim();
    }
}
