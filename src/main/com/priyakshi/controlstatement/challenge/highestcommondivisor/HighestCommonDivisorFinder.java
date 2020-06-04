package com.priyakshi.controlstatement.challenge.highestcommondivisor;

public class HighestCommonDivisorFinder {

    public int findHighestCommonDivisor(int firstNumber, int secondNumber) {
        int highestCommonDivisor = 1;
        int highestPossibleDivisor = 0;
        if (firstNumber > secondNumber) {
            highestPossibleDivisor = secondNumber;
        } else {
            highestPossibleDivisor = firstNumber;
        }
        for (int i = 2; i <= highestPossibleDivisor; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                highestCommonDivisor = i;
            }
        }
        return highestCommonDivisor;
    }
}

