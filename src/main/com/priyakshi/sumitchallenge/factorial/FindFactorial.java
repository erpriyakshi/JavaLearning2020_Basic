package com.priyakshi.sumitchallenge.factorial;

public class FindFactorial {
    public double findFactorial(int number) {
        double factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial*i;

        }
        return factorial;
    }
}

