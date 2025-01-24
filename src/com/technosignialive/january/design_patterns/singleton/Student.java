package com.technosignialive.january.design_patterns.singleton;

public class Student implements Cloneable{
    private static Student student = null;
    private Student() {

    }

    public static synchronized Student getObject() {
        if (student == null) {
            student = new Student();
        }
        return student;
    }

    public Object clone() {
        return new CloneNotSupportedException();
    }
}
