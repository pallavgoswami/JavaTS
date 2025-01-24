package com.technosignialive.september.week_2;

import java.util.Scanner;

public class StudyAbroadFirm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        int totalFee = 0;
        do {
            System.out.println("**** Dreams come true here ****");
            System.out.println("**** Select your study abroad destination ****");
            System.out.println("1. USA");
            System.out.println("2. UK");
            System.out.println("3. Australia");
            System.out.println("4. Germany");
            System.out.println("5. Ireland");
            int choice = sc.nextInt();
            int fee = 0;
            String lastDestination = "";

            switch (choice) {
                case 1:
                    lastDestination = "USA";
                    System.out.println("Your chosen destination is USA");
                    System.out.println("Choose from below courses");
                    System.out.println("1. BE in CS");
                    System.out.println("2. MS in CS");
                    int course = sc.nextInt();
                    switch (course) {
                        case 1:
                            System.out.println("You have chosen BE in CS");
                            fee = 40000;
                            break;
                        case 2:
                            System.out.println("You have chosen MS in CS");
                            fee = 50000;
                            break;
                    }
                    totalFee += fee;
                    break;
                case 2:
                    lastDestination = "UK";
                    System.out.println("Your chosen destination is UK");
                    break;
                case 3:
                    lastDestination = "Australia";
                    System.out.println("Your chosen destination is Australia");
                    break;
                case 4:
                    lastDestination = "Germany";
                    System.out.println("Your chosen destination is Germany");
                    break;
                case 5:
                    lastDestination = "Ireland";
                    System.out.println("Your chosen destination is Ireland");
                    break;
                default:
                    System.out.println("Please choose from the available destinations only");
            }

            if (!lastDestination.isEmpty()) {
                System.out.println("Do you want to change your country? (Yes/No)");
                String cancel = sc.next();
                if (cancel.equalsIgnoreCase("Yes")) {
                    System.out.println("You can change your country now");
                    lastDestination = "";
                } else {
                    System.out.println(lastDestination + " is confirmed");
                }
            }
            System.out.println("Do you want to explore another country? (Yes/No)");
            input = sc.next();
        } while (input.equalsIgnoreCase("Yes"));
        System.out.println("Your total fees for the chosen country and course is $" + totalFee);
    }
}
