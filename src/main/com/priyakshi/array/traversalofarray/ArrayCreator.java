package com.priyakshi.array.traversalofarray;

import java.util.Scanner;

public class ArrayCreator {

    public Integer[] createArray() {
        Integer[] myArray = new Integer[getSize()];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Elements of Array");
        for (int i = 0; i < myArray.length; i++) {
            boolean isHasNextInt = scanner.hasNextInt();
            if (isHasNextInt) {
                myArray[i] = scanner.nextInt();
            }
        }
        return myArray;
    }

    private int getSize() {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        System.out.println("Enter Size of Array :");
        boolean isHasNextInt = scanner.hasNextInt();
        if (isHasNextInt) {
            size = scanner.nextInt();
        }
        return size;
    }
}
