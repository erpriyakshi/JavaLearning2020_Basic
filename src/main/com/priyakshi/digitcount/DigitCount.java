package com.priyakshi.digitcount;

public class DigitCount {
    public int digitCount(int number) {

        int absNumber = Math.abs(number);
        int count = 0;
        while (absNumber > 0) {
            int reminder = absNumber % 10;
            absNumber = absNumber / 10;
            count++;
        }
        return count;
    }
}
