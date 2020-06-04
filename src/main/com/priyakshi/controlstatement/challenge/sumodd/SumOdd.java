package com.priyakshi.controlstatement.challenge.sumodd;

public class SumOdd {
    public boolean isOdd(int number) {
        if (number % 2 != 0) {
            return true;
        }
        return false;
    }

    public int sumOdd(int start, int end) {
        int sum = 0;
        for (int number = start; number <= end; number++) {
            if (isOdd(number)) {
                sum = sum + number;
            }
        }
        return sum;
    }
    public boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
