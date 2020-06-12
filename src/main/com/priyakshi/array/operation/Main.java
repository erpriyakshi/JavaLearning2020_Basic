package com.priyakshi.array.operation;

import com.priyakshi.array.print.ArrayConsolePrinter;
import com.priyakshi.array.print.ArrayPrinter;
import com.priyakshi.array.traversalofarray.ArrayCreator;

public class Main {
    public static void main(String[] args) {
        ArrayCreator arrayCreator = new ArrayCreator();
        Integer[] array = arrayCreator.createArray();
        ArrayPrinter arrayPrinter = new ArrayConsolePrinter();
        ArrayOperation arrayOperation = new ArrayOperation(arrayPrinter);
        arrayOperation.run(array);
    }
}
