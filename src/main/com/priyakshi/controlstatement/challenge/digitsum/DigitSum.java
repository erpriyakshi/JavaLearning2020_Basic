package com.priyakshi.controlstatement.challenge.digitsum;

public class DigitSum {
    public int sumdigits(int number) {
        boolean isNegative = number < 0;
        number = Math.abs(number);
        int sum = 0;
        while (number > 0) {
            int reminder = number % 10;
            sum = sum + reminder;
            int dividend = number / 10;
            number = dividend;
        }
        if (isNegative) {
            sum = sum * -1;
        }
        return sum;
    }

    public int sumOfFirstAndLastDigit(int number) {
        int firstDigit = 0;
        int lastDigit = 0;
        boolean lastDigitFound = false;

        while (number > 0) {
            int reminder = number % 10;
            firstDigit = reminder;
            number = number / 10;
            if (!lastDigitFound) {
                lastDigit = reminder;
                lastDigitFound = true;
            }
        }

        int sum = firstDigit + lastDigit;
        return sum;


    }
}
