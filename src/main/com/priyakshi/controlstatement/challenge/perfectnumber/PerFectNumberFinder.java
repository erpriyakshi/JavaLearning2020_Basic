package com.priyakshi.controlstatement.challenge.perfectnumber;

public class PerFectNumberFinder {
    public boolean isPerfectNumber(int number) {
        int sumOfDivisor = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDivisor = sumOfDivisor + i;
            }
        }
        if (number == sumOfDivisor) {
            return true;
        }
        return false;
    }

    public void printPerfectNumber(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPerfectNumber(i)) {
                System.out.println(i + " is a perfect Number");
            }
        }

    }

}
