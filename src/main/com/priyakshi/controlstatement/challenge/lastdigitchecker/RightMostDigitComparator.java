package com.priyakshi.controlstatement.challenge.lastdigitchecker;

public class RightMostDigitComparator {
    public boolean lastDigitChecker(int firstNumber, int secondNumber, int thirdNumber) {
        int firstNumberReminder = firstNumber % 10;
        int secondNumberReminder = secondNumber % 10;
        int thirdNumberReminder = thirdNumber % 10;
        if (firstNumberReminder == secondNumberReminder || secondNumberReminder == thirdNumberReminder || thirdNumberReminder == firstNumberReminder) {
            return true;
        }
        return false;
    }
}
