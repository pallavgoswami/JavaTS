package com.technosignialive.november.exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Throws {
    static void openFile() throws FileNotFoundException {
        File file = new File("C:\\Users\\Pallav\\IdeaProjects\\TechnoSigniaLive\\src\\com\\technosignialive\\november\\exception_handling\\hierarchy-of-exception-handling.png");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        openFile();
        System.out.println("Program continues");
    }
}
