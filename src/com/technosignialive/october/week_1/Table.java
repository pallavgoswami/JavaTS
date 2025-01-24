package com.technosignialive.october.week_1;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print its table");
        int num = sc.nextInt();
        for (int i = 1; i <= 20; i++) {
            int product = num * i;
            System.out.println(num + " x " + i + " = " + product);
        }
    }
}
