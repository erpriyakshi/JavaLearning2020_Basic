package com.array.array.print;

public class Main {
    public static void main(String[] args) {
        PrintArray printArray = new PrintArray();
        int[] intArray = {12, 43, 456, 5765, 343, 3243, 34, 34, 34, 235, 2354, 2, 54, 65};
        printArray.printArray(intArray);

        double[] doubleArray = {12.21, 43.21, 45.6, 57.65, 34.23, 324.21213, 34.1313, 34.3113, 34.131, 235, 2354, 2, 54, 65};
        printArray.printArray(doubleArray);
    }
}
