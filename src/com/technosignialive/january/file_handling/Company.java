package com.technosignialive.january.file_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// transient example

class Employee  implements Serializable{
    private long id;
    private String name;
    private transient int salary; // will not be serialised during compilation
    public Employee(long id, String name, int salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Id = "+this.id+", name:"+this.name+", salary:"+this.salary;
    }
}

public class Company{
    public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException {

        Employee e1 = new Employee(1,"Jhon",10000);

        System.out.println(e1.toString());

        String fileName = "employee.ser";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));

        oos.writeObject(e1);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));

        Employee deserializeObj = (Employee) ois.readObject();

        System.out.println(deserializeObj.toString());


    }
}