package com.priyakshi.array.oddnumbers;

public class OddNumbersFinder {
    public Integer[] printOddNumbers(Integer intArray[]) {
        Integer oddNumbers[] = new Integer[intArray.length];
        int oddNumberCounter = 0;
        OddNumberFinder oddNumberFinder = new OddNumberFinder();
        for (int i = 0; i < intArray.length; i++) {
            boolean isOddNumber = oddNumberFinder.isOddNumber(intArray[i]);
            if (isOddNumber) {
                oddNumbers[oddNumberCounter] = intArray[i];
                oddNumberCounter++;
            }
        }
        return oddNumbers;
    }
}
