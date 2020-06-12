package com.priyakshi.array.primenumber;

import com.priyakshi.array.print.ArrayConsolePrinter;

public class Main {

    // wap to find out all the prime numbers from the list
    // ArrayPrimeNumberFinder - Class
    // public int[] getAllPrimeNumbers(int[] intArray)
    public static void main(String[] args) {
        Integer[] intArray = {0, 1, 2, 13, 28, 37, 43};
        PrimeNumbersFinder finder = new PrimeNumbersFinder();
        Integer[] allPrimeNumbers = finder.getAllPrimeNumbers(intArray);
        System.out.println("Prime numbers found:");
        ArrayConsolePrinter arrayConsolePrinter = new ArrayConsolePrinter();
        arrayConsolePrinter.printArray(allPrimeNumbers);
    }
}
