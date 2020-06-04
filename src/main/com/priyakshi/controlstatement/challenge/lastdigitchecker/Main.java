package com.priyakshi.controlstatement.challenge.lastdigitchecker;

public class Main {
    public static void main(String[] args) {
        RightMostDigitComparator rightMostDigitComparator = new RightMostDigitComparator();
        boolean lastDigitChecker = rightMostDigitComparator.lastDigitChecker(11, 11, 14);
        System.out.println("Has Number same RightMostDigit = " + lastDigitChecker);
    }
}
