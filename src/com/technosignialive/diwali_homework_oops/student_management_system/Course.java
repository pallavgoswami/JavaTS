package com.technosignialive.diwali_homework_oops.student_management_system;
// 3.	Student Management System
//	•	Design a Student class with attributes for name, age, and roll number. Implement methods to set and get these attributes.
//	Create a Course class that has a list of Student objects enrolled in the course. Add methods to add and remove students from a course.
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<Student>();
    }

    // add student
    public void addStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println("Added: " + student);
    }

    // remove student by roll no
    public void removeStudent(String rollno) {
        Student studentToRemove = null;
        for (Student student : enrolledStudents) {
            if (student.getRollNo().equals(rollno)) {
                studentToRemove = student;
                break;
            }
        }

        if (studentToRemove != null) {
            enrolledStudents.remove(studentToRemove);
            System.out.println("Removed: " + studentToRemove);
        } else {
            System.out.println("Student with roll number: " + rollno + " not found");
        }
    }

    // Method to list all students
    public void listStudents() {
        if (enrolledStudents.isEmpty()) {
            System.out.println("No students are enrolled in the course");
        } else {
            System.out.println("Students enrolled in " + courseName + ":");
            for (Student student : enrolledStudents) {
                System.out.println(student);
            }
        }
    }
}
