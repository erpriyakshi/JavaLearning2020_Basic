package com.priyakshi.codingexercise.decimalcomparator;

public class DecimalComparator {
    public boolean areEqualByThreeDecimalPlaces(Double a, Double b) {
        double aAfterMultiplyBy1000 = a * 1000;
        double bAfterMultiplyBy1000 = b * 1000;
        int aIntegerValue = (int) aAfterMultiplyBy1000;
        int bIntegerValue = (int) bAfterMultiplyBy1000;
        if (aIntegerValue == bIntegerValue) {
            return true;
        } else {
            return false;
        }
    }
}
