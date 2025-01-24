package com.technosignialive.january.design_patterns.singleton;

public class SingletonDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = Student.getObject();
        Student s2 = Student.getObject();
        Student s3 = (Student) s1.clone();

        System.out.println(s1==s2);
        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1==s3);
        System.out.println(s3);
    }
}
