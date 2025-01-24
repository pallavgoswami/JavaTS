package com.technosignialive.august;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print its table");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int product = num * i;
            System.out.println(product);
        }
    }
}
