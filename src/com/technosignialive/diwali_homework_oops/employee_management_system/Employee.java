package com.technosignialive.diwali_homework_oops.employee_management_system;
// 4.	Employee Management System
//	•	Create an Employee class with attributes like name, position, salary, and department.
//	Implement methods to calculate bonuses based on position and experience. Write a program to display the details of the employees.
public class Employee {
    private String name;
    private String position;
    private double salary;
    private String department;
    private int experience;

    // constructor to instantiate attributes
    Employee(String name, String position, double salary, String department, int experience) {
        this.name = name;
        this.position = position;
        this.salary= salary;
        this.department = department;
        this.experience = experience;
    }

    // method to calculate bonus on position and experience
    public double calculateBonus() {
        double bonus = 0;
        if (position.equalsIgnoreCase("Manager")) {
            bonus = salary * 0.2 + experience * 1000;
        } else if (position.equalsIgnoreCase("Developer")) {
            bonus = salary * 0.15 + experience * 800;
        } else if (position.equalsIgnoreCase("Intern")) {
            bonus = salary * 0.05;
        } else {
            bonus = salary * 0.1;
        }
        return bonus;
    }

    // display employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Salary: $" + salary);
        System.out.println("Department: " + department);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Bonus: $" + calculateBonus());
    }
}
