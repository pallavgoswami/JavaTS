package com.technosignialive.september.week_2;

import java.util.Scanner;

public class TheTajPalaceApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int orderNo = 0;
        String choice = "";
        String lastOrder = "";
        int lastBill = 0;
        int totalBill = 0;
        do {
            System.out.println("#### The Taj Palace ####");
            System.out.println("#### Menu Card ####");
            System.out.println("1. Starter");
            System.out.println("2. Main Course");
            System.out.println("3. Dessert");
            System.out.println("4. Beverages");
            System.out.println("5. Tea");
            System.out.println("6. Exit");
            System.out.println("Please order from above menu");
            orderNo = sc.nextInt();

            switch (orderNo) {
                case 1:
                    lastOrder = "Starter";
                    lastBill = 200;
                    System.out.println("Your order for Starter is placed successfully");
                    break;
                case 2:
                    lastOrder = "Main Course";
                    lastBill = 300;
                    System.out.println("Your order for Main Course is placed successfully");
                    break;
                case 3:
                    lastOrder = "Dessert";
                    lastBill = 100;
                    System.out.println("Your order for Dessert is placed successfully");
                    break;
                case 4:
                    lastOrder = "Beverages";
                    lastBill = 50;
                    System.out.println("Your order for Beverages is placed successfully");
                    break;
                case 5:
                    lastOrder = "Tea";
                    lastBill = 30;
                    System.out.println("Your order for Tea is placed successfully");
                    break;
                case 6:
                    System.out.println("Thanks");
                    System.exit(0);
                default:
                    System.out.println("Please choose from the menu only!");
                    lastOrder = "";
                    lastBill = 0;

            }



            if (!lastOrder.isEmpty()) {
                System.out.println("Do you want to cancel your last order? (yes/no)");
                String cancel = sc.next();
                if (cancel.equalsIgnoreCase("yes")) {
                    System.out.println("Your order for " + lastOrder + " has been cancelled");
                    lastOrder = "";
                    lastBill = 0;
                } else {
                    System.out.println("Your order for " + lastOrder + " has been confirmed");
                    totalBill += lastBill;
                }
            }

            System.out.println("Do you want to order more food? (yes/no)");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("yes"));
        System.out.println("Your total bill is Rupees " + totalBill);
        System.out.println("Thank you! Visit Again");
    }
}
