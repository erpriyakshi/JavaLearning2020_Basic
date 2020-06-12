package com.priyakshi.array.oddnumbers;

import com.priyakshi.array.print.ArrayConsolePrinter;

public class Main {
    public static void main(String[] args) {
        Integer intArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        OddNumbersFinder oddNumbersFinder = new OddNumbersFinder();
        Integer[] allOddNumbers = oddNumbersFinder.printOddNumbers(intArray);
        System.out.println("Prime numbers found:");
        ArrayConsolePrinter arrayConsolePrinter = new ArrayConsolePrinter();
        arrayConsolePrinter.printArray(allOddNumbers);
    }
}
