package com.priyakshi.array.sort;

public class ArrayBubbleSorter {
    public Integer[] sortInAscendingOrder(Integer[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length - i - 1; j++) {
                if(intArray[j+1] < intArray[j]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
        return intArray;
    }
    public Integer[] sortInDescendingOrder(Integer[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length - i - 1; j++) {
                if(intArray[j+1] > intArray[j]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
        return intArray;
    }
}
