package com.priyakshi.controlstatement.challenge.palindromenumber;

public class PalindromeNumberFinder {
    public int reverseNumber(int number) {
        int reverseNumber = 0;
        number = Math.abs(number);
        while (number > 0) {
            int reminder = number % 10;
            reverseNumber = reverseNumber * 10 + reminder;
            number = number / 10;
            ;
        }
        return reverseNumber;
    }

    public boolean isPalindromeNumber(int number) {
        if (number == reverseNumber(number)) {
            return true;
        }
        return false;
    }
}