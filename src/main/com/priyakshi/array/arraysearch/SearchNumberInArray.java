package com.priyakshi.array.arraysearch;

public class SearchNumberInArray {
    public boolean searchNumber(int[] intArray, int number) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == number) {
                return true;
            }
        }
        return false;

    }
}
