package com.priyakshi.array.sum;

public class ArraySum {

    public int sumOfArray(int[] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum = sum + intArray[i];
        }
        return sum;
    }
}
