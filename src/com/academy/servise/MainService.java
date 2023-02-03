package com.academy.servise;

import com.academy.models.Lectures;

import java.util.Scanner;

import static com.academy.models.Lectures.ID;
import static com.academy.models.Lectures.counter;


public class MainService {
    public static com.academy.models.Lectures lectures;


    public static Scanner scanner = new Scanner(System.in);

    public static void chooseNext() {
        int answer;
        do {
            System.out.println("1: Create new lectures?\n" +
                    "2: return to select category");
            answer = scanner.nextInt();
            switch (answer) {
                case 1 -> {
                    System.out.println("Enter name");
                    String lecturesName = scanner.next();
                    System.out.println(new Lectures(counter++ + 7, 1, lecturesName));
                    if (ID == 8){
                        System.out.println("Goodbye. See you next time.");
                        System.exit(0);
                    }
                }
                case 2 -> System.out.println("return to select category");
                default -> System.out.println(" wrong print ");
            }
        }
        while (answer != 2);
    }

    public static void choose() {
        int command;

        do {
            System.out.println("""
                    Select make your choice and press Enter
                    1: Courses
                    2: Teachers
                    3: Students
                    4: Lectures
                    5: Exit""");
            command = scanner.nextInt();
            switch (command) {
                case 1 -> System.out.println("Category Courses");
                case 2 -> System.out.println("Category Teachers");
                case 3 -> System.out.println("Category Students");
                case 4 -> {
                    System.out.println("Category Lectures");
                    chooseNext();
                }
                case 5 -> System.out.println("Exit");
                default -> System.out.println("No such category exit");
            }
        }
            while (command != 5) ;
    }
}


























    
    

    


