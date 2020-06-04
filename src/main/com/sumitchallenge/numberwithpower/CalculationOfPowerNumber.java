package com.sumitchallenge.numberwithpower;

public class CalculationOfPowerNumber {

    public int getResultOfPowerNumber(int number, int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }
        return result;
    }
}
