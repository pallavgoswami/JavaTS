package com.technosignialive.november.exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundEx {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Pallav\\IdeaProjects\\TechnoSigniaLive\\src\\com\\technosignialive\\november\\exception_handling");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Program continues....");
    }
}
