package com.priyakshi.controlstatement.challenge.primenumber;

public class PrimeNumberCalculator {

    public boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        int maxPossibleDividend = number / 2;
        for (int i = 2; i <= maxPossibleDividend; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPrimeNumberUsingVariable(int number) {
        boolean isPrimeNumber = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }
        return isPrimeNumber;
    }

    public void printAllPrimeNumbersInGivenRange(int start, int end) {
        int noOfPrimeNumber = 0;
        for (int number = start; number <= end; number++) {
            if (isPrimeNumber(number)) {
                System.out.println(number + " is a prime number");
                noOfPrimeNumber++;
                if (noOfPrimeNumber >= 3) {
                    break;
                }
            }
        }
        System.out.println("Total Prime Number found = " + noOfPrimeNumber);
    }
}
