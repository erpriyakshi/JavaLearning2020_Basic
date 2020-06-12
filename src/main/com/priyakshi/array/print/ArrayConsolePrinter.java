package com.priyakshi.array.print;

public class ArrayConsolePrinter implements ArrayPrinter {

    @Override
    public void printArray(Integer intArray[]) {
        for (int i = 0; i < intArray.length && intArray[i] != null; i++) {
            System.out.printf("Value at index %2d = %4d\n", i, intArray[i]);
        }
    }

    @Override
    public void printArray(Double doubleArray[]) {
        for (int i = 0; i < doubleArray.length && doubleArray[i] != null; i++) {
            System.out.printf("Value at index %2d = %6.2f\n", i, doubleArray[i]);
        }
    }
}
