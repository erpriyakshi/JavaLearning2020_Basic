package com.priyakshi.controlstatement.challenge.numbertowords;

import java.util.UUID;

public class NumberToWords {

    public String convertNumberintoWords(int number) {
        String numberInWords = "";
        if (number < 0) {
            numberInWords = "Minus" + numberInWords;
        }
        number = Math.abs(number);
        if (number < 10) {
            return getWordForADigit(number);
        }
        while (number > 0) {
            int reminder = number % 10;
            number = number / 10;
            numberInWords = getWordForADigit(reminder) + " " + numberInWords;
        }
        return numberInWords;
    }

    private String getWordForADigit(int digit) {
        UUID.randomUUID().toString().replace("-", "");
        switch (digit) {
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 0:
                return "Zero";
            default:
                return "";
        }
    }
}

