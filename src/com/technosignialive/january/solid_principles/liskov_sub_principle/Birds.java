package com.technosignialive.january.solid_principles.liskov_sub_principle;

class Birds {
    public void eat() {
        System.out.println("Bird is eating");
    }
}

interface Flyable {
    void fly();
}

class Sparrow extends Birds implements Flyable {
    public void fly() {
        System.out.println("Sparrow is flying");
    }
    public void eat() {
        System.out.println("Sparrow is eating");
    }
}

class Penguin extends Birds {
    public void eat() {
        System.out.println("Penguin is eating");
    }
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}

