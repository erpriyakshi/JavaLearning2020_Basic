package com.priyakshi.controlstatement.challenge.userinput;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReadingUserInput {
    public void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your date Of year");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your name");
            String name = scanner.nextLine();
            int age = 2018 - yearOfBirth;
            if (age > 0 & age <= 100) {
                System.out.println("Your name is " + name + " and Your age is " + age + ".");
            }else{
                System.out.println("invalid birth of year");
            }
        }else{
            System.out.println("Unable to parse year of birth");
        }
        scanner.close();

    }

}
