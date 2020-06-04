package com.array.oddnumbers;

public class OddNumbersFinder {
    public int[] printOddNumbers(int intArray[]) {
        int oddNumbers[] = new int[intArray.length];
        int oddNumberCounter = 0;
        OddNumberFinder oddNumberFinder = new OddNumberFinder();
        for (int i = 0; i < intArray.length; i++) {
            boolean isOddNumber = oddNumberFinder.isOddNumber(intArray[i]);
            if (isOddNumber) {
                oddNumbers[oddNumberCounter] = intArray[i];
                oddNumberCounter++;
            }
        }
        for (int i = oddNumberCounter; i < oddNumbers.length; i++) {
            oddNumbers[i] = -1;
        }
        return oddNumbers;
    }
}
