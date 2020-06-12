package com.priyakshi.array.print;

public class Main {
    public static void main(String[] args) {
        ArrayConsolePrinter arrayConsolePrinter = new ArrayConsolePrinter();

        Integer[] intArray = {12, 43, 456, 5765, 343, 3243, 34, 34, 34, 235, 2354, 2, 54, 65};
        arrayConsolePrinter.printArray(intArray);

        Double[] doubleArray = {12.21, 43.21, 45.6, 57.65, 34.23, 324.21213, 34.1313, 34.3113, 34.131, 235d, 2354d, 2.0, 54d, 65d};
        arrayConsolePrinter.printArray(doubleArray);
    }
}
