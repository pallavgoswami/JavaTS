package com.technosignialive.diwali_homework_oops.student_management_system;

public class Main {
    public static void main(String[] args) {
        // Create a new course
        Course course = new Course("Computer Science");

        // Create students
        Student s1 = new Student("Pallav", 24, "CS33");
        Student s2 = new Student("Vaibhav", 26, "CS55");
        Student s3 = new Student("Rahul", 22, "CS66");

        // Add students to course
        course.addStudent(s1);
        course.addStudent(s2);
        course.addStudent(s3);

        // List all students
        course.listStudents();

        // Remove a student by rollno
        course.removeStudent("CS66");

        // List after removal
        course.listStudents();

    }
}
