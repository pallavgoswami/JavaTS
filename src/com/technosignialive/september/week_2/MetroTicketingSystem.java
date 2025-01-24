package com.technosignialive.september.week_2;

import java.util.Scanner;

public class MetroTicketingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in which class you want to travel: A or B?");
        String input = sc.next().toUpperCase();
        System.out.println("How much distance in Kms is it?");
        int distance = sc.nextInt();
        int fareA = distance * 30;
        int fareB = distance * 10;

        if (input.equals("A")) {
            System.out.println("The total fare is Rupees: " + fareA);
        } else if (input.equals("B")) {
            System.out.println("The total fare is Rupees: " + fareB);
        }
    }
}
