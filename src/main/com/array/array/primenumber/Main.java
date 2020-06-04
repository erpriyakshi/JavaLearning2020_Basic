package com.array.array.primenumber;

import com.array.array.print.PrintArray;

public class Main {

    // wap to find out all the prime numbers from the list
    // ArrayPrimeNumberFinder - Class
    // public int[] getAllPrimeNumbers(int[] intArray)
    public static void main(String[] args) {
        int[] intArray = {0, 1, 2, 13, 28, 37, 43};
        PrimeNumbersFinder finder = new PrimeNumbersFinder();
        int[] allPrimeNumbers = finder.getAllPrimeNumbers(intArray);
        System.out.println("Prime numbers found:");
        PrintArray printArray = new PrintArray();
        printArray.printArray(allPrimeNumbers);
    }
}
