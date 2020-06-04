package com.priyakshi.controlstatement.challenge.largestprimenumber;

import com.priyakshi.controlstatement.challenge.primenumber.PrimeNumberCalculator;

public class LargestPrimeNumber {
    PrimeNumberCalculator primeNumberCalculator = new PrimeNumberCalculator();

    public int getLargestPrimeNumber(int number) {
        if (number <= 1) {
            return -1;
        }
        int largestPrimeNumber = -1;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && primeNumberCalculator.isPrimeNumber(i) && i > largestPrimeNumber) {
                largestPrimeNumber = i;
            }
        }

        return largestPrimeNumber;
    }
}
