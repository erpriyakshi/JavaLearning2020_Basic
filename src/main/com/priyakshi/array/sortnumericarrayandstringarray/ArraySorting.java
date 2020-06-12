package com.priyakshi.array.sortnumericarrayandstringarray;

import java.util.Arrays;

public class ArraySorting {
    public void sortingArray() {
        int myNumericArray[] = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
        String myStringArray[] = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};
        System.out.println("Original Numeric Array : "+ Arrays.toString(myNumericArray));
        Arrays.sort(myNumericArray);
        System.out.println("Sorted Numeric Array : "+ Arrays.toString(myNumericArray));
        System.out.println("original Sorted Array : ");
    }
}
