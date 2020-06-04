package com.array.print;

import java.util.Objects;
import java.util.stream.Stream;

public class PrintArray {

    public void printArray(int intArray[]) {
        for (int i = 0; i < intArray.length && intArray[i] != -1; i++) {
            //System.out.printf("Value at index " + i + " = " + intArray[i]);
            System.out.printf("Value at index %2d = %4d\n", i, intArray[i]);
        }
    }

    public void printArray(double doubleArray[]) {
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.printf("Value at index %2d = %7.3f\n", i, doubleArray[i]);
        }
    }
}
