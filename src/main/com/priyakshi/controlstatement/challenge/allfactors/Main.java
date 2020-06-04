package com.priyakshi.controlstatement.challenge.allfactors;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 3) {
            System.out.println("Enter Number");
            boolean isNextInt = scanner.hasNextInt();
            if (isNextInt) {
                int number = scanner.nextInt();
                AllFactorsFinder allFactorsFinder = new AllFactorsFinder();
                allFactorsFinder.findAllFactors(number);
                break;
            }else{
                System.out.println("Entered value is incorrect. Please Try Again");
                scanner.nextLine();
                count++;
                if(count==3){
                    System.out.println("Retry limit Reached. Exiting...");
                }
            }
        }

    }
}
