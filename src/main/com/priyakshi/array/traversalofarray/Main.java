package com.priyakshi.array.traversalofarray;

import com.priyakshi.array.print.ArrayConsolePrinter;
import com.priyakshi.array.sort.ArrayBubbleSorter;

public class Main {
    public static void main(String[] args) {
        ArrayCreator arrayCreator = new ArrayCreator();
        ArrayConsolePrinter arrayConsolePrinter = new ArrayConsolePrinter();
        ArrayBubbleSorter sorter = new ArrayBubbleSorter();

        Integer[] intArray = arrayCreator.createArray();

        System.out.println("User Input Array::");
        arrayConsolePrinter.printArray(intArray);

        Integer[] sortedIntArray = sorter.sortInAscendingOrder(intArray);
        System.out.println("Sorted Array::");

        arrayConsolePrinter.printArray(sortedIntArray);
    }
}
