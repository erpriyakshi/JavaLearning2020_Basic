package com.array.array.oddnumbers;

import com.array.array.print.PrintArray;

public class Main {
    public static void main(String[] args) {
        int intArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        OddNumbersFinder oddNumbersFinder = new OddNumbersFinder();
        int[] allOddNumbers = oddNumbersFinder.printOddNumbers(intArray);
        System.out.println("Prime numbers found:");
        PrintArray printArray = new PrintArray();
        printArray.printArray(allOddNumbers);
    }
}
