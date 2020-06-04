package com.priyakshi.controlstatement.challenge.inputprintsumandaverage;

import java.util.Scanner;

public class PrintSumAndAverage {

    public void printSumAndAverage() {
        int sum = 0;
        long avg = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number");
            boolean isNextInt = scanner.hasNextInt();
            if (isNextInt) {
                int number = scanner.nextInt();
                sum = sum + number;
                count++;
                avg = Math.round((float)sum / count);
            } else {
                System.out.println("SUM = " + sum + "  AVG = " + avg);
                break;
            }
        }
    }
}
