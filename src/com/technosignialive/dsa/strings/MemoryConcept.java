package com.technosignialive.dsa.strings;

public class MemoryConcept {
    public static void main(String[] args) {
        String str = "java";
        String str2 = "Java";
        String str3 = new String("Java");

        System.out.println(str==str2);
        System.out.println(str==str3);
        System.out.println(str2==str3);
        System.out.println(str2.equals(str3));


    }
}
