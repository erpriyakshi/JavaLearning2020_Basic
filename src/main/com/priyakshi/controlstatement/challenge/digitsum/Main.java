package com.priyakshi.controlstatement.challenge.digitsum;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int number = 908;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        boolean isNextInt = scanner.hasNextInt();
        if(isNextInt) {
            int number =scanner.nextInt();
            DigitSum digitSum = new DigitSum();
            int sumdigits = digitSum.sumdigits(number);
            System.out.println("Digits Sum of " + number + " is " + sumdigits);
            int sumOfFirstAndLastDigit = digitSum.sumOfFirstAndLastDigit(number);
            System.out.println("Sum of first and last digit of " + number + " is " + sumOfFirstAndLastDigit);
        }

    }

}
