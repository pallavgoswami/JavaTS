package com.technosignialive.september.week_2;

import java.util.Scanner;
import java.lang.Math;
// The java.lang.Math.random() method returns a pseudorandom double type number greater than or equal to 0.0 and less than 1.0.
public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randInt = (int) (Math.random() * 100) + 1;
        int tries = 0;
        System.out.println("Enter a number to guess:" );
        do {
            int userNum = sc.nextInt();
            tries++;
            if (userNum < 1 || userNum > 100) {
                System.out.println("Please enter a number between 1 and 100");
                continue;
            }
            if (userNum == randInt) {
                System.out.println("Congratulations! You have guessed correctly");
                System.out.println("The number was " + randInt);
                System.out.println("Number of attempts taken are " + tries);
                break;
            } else if (userNum > randInt) {
                System.out.println("Your guess is too high");
            } else {
                System.out.println("Your guess is too low");
            }
        } while (true);

    }



}
