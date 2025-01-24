package com.technosignialive.diwali_homework_oops.employee_management_system;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // List to hold employee objects
        ArrayList<Employee> employees = new ArrayList<Employee>();

        // Adding employees
        employees.add(new Employee("Pallav", "Manager", 80000, "CS", 10));
        employees.add(new Employee("Vaibhav", "Developer", 60000, "IT", 5));
        employees.add(new Employee("Abhinav", "Intern", 600000000, "HR", 100));

        // Display details
        System.out.println("Employee Details:");
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("*******************");
        }
    }
}
