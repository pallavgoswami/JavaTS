package com.technosignialive.september.week_4.oops.encapsulation;

public class Employee {
    private int id; // accessible only within a class and called properties, data members,
    private String name; // global/instance variables or fields

    //setters
    public void setId(int id) { //101
        if (id >= 101) {
            this.id = id;
        } else {
            System.out.println("Id should be greater than 100");
        }
    }

    public void setName(String name) { // Smith
        this.name = name;
    }

    //getters
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

}

/*
POJO -> Plain Old Java Object or Bin class can read/write or read only , write only
 */
