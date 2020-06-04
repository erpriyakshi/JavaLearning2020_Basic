package com.sumitchallenge.divisoroutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DivisonOutput divisonOutput = new DivisonOutput();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Divident");
        boolean isHasNextDivident = scanner.hasNext();
        System.out.println("Enter Divisor");
        boolean isHasNextDivisor = scanner.hasNext();
        if (isHasNextDivident && isHasNextDivisor) {
            int divident = scanner.nextInt();
            int divisor = scanner.nextInt();
            int quotient = divisonOutput.getQuotient(divident, divisor);
            System.out.println("Quotient is " + quotient);
            int reminder = divisonOutput.getReminder(divident, divisor);
            System.out.println("Reminder is " + reminder);
        }
    }
}
