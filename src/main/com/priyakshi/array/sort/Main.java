package com.priyakshi.array.sort;

import com.priyakshi.array.print.ArrayConsolePrinter;

public class Main {

    public static void main(String[] args) {
        Integer[] intArray = {91, 82, 73, 64, 2, 55, 46, 37};
        ArrayBubbleSorter arrayBubbleSorter = new ArrayBubbleSorter();
        Integer[] sortedIntArray = arrayBubbleSorter.sortInAscendingOrder(intArray);
        ArrayConsolePrinter arrayConsolePrinter = new ArrayConsolePrinter();
        arrayConsolePrinter.printArray(sortedIntArray);
        Integer[] sortedDescendingArray = arrayBubbleSorter.sortInDescendingOrder(intArray);
        arrayConsolePrinter.printArray(sortedDescendingArray);
    }

}
