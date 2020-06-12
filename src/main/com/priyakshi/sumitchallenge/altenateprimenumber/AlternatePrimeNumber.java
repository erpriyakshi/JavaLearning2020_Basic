package com.priyakshi.sumitchallenge.altenateprimenumber;

public class AlternatePrimeNumber {
    public boolean isPrimeNumber(int number) {
        int maxPossibleDividend = number / 2;
        for (int i = 2; i <= maxPossibleDividend; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void alternatePrimeNumber(int start, int end) {
        boolean firstPrimeNumber = true;
        for (int number = start; number <= end; number++) {
            if (isPrimeNumber(number)) {
                if (firstPrimeNumber) {
                    System.out.println("Prime number is " + number);
                    firstPrimeNumber = false;
                }else{
                    firstPrimeNumber =true;
                }
            }
        }
    }
}
