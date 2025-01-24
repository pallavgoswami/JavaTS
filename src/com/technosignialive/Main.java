package com.technosignialive;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = sc.next();
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                char ch = input.charAt(i);
                System.out.println(ch);
            }
        }
    }
}
