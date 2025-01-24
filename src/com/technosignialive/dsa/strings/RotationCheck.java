package com.technosignialive.dsa.strings;

public class RotationCheck {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "vaja";

        if (isRotation(str1, str2)) {
            System.out.println("The strings are rotations of each other.");
        } else {
            System.out.println("The strings are not rotations of each other.");
        }
    }

    public static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        String combined = str1 + str1;
        return combined.contains(str2);
    }
}
