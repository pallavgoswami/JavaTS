package com.technosignialive.september.week_4.oops.encapsulation;

public class Company {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        // setter methods
        e1.setId(101);
        e1.setName("Smith");
        e2.setId(102);
        e2.setName("John");
        e3.setId(103);
        e3.setName("Sachin");

        System.out.println("Id: " + e1.getId() + ", Name: "+ e1.getName());
        System.out.println("Id: " + e2.getId() + ", Name: "+ e2.getName());
        System.out.println("Id: " + e3.getId() + ", Name: "+ e3.getName());
    }
}
