package com.priyakshi.controlstatement.challenge.userinput;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public void readingUserInputhallenge() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (counter < 3) {
            int order = counter + 1;
            System.out.println("Enter number #" + order);
            boolean isNextInt = scanner.hasNextInt();
            if (isNextInt) {
                int number = scanner.nextInt();
                counter++;
                sum = sum + number;
            }else{
                System.out.println("Enter number is not a valid number");
            }
            String temp = scanner.nextLine();
            System.out.println(temp);
        }
        System.out.println("Sum is "+ sum);
    }
}
