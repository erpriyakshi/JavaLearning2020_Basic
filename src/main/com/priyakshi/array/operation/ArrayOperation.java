package com.priyakshi.array.operation;

import com.priyakshi.array.print.ArrayPrinter;

import java.util.Scanner;

public class ArrayOperation {

    private final ArrayPrinter arrayPrinter;
    private final Scanner scanner = new Scanner(System.in);

    public ArrayOperation(ArrayPrinter arrayPrinter) {
        this.arrayPrinter = arrayPrinter;
    }

    public void run(Integer[] myArray) {
        int number = 0;
        do {
            arrayPrinter.printArray(myArray);
            System.out.println("Enter 0 to exits");
            System.out.println("Enter 1 to insert element in Array");
            System.out.println("Enter 2 to update element in Array by index");
            System.out.println("Enter 3 to update element in Array by value");
            System.out.println("Enter 4 to delete element in Array by value");
            System.out.println("Enter 5 to delete element in Array by index");
            boolean isHasNextInt = scanner.hasNextInt();
            if (isHasNextInt) {
                number = scanner.nextInt();
                if (number == 1) {
                    myArray = insertElement(myArray);
                } else if (number == 2) {
                    myArray = updateElementByIndex(myArray);
                } else if (number == 3) {
                    myArray = updateElementByValue(myArray);
                } else if (number == 4) {
                    myArray = deleteElementByValue(myArray);
                } else if (number == 5) {
                    myArray = deleteElementByIndex(myArray);
                } else {
                    System.out.println("Entered choice is not correct. Try again..");
                }
            }
        } while (number != 0);
    }

    private Integer[] insertElement(Integer[] myArray) {
        System.out.println("Enter index where you want to insert value");
        boolean isHasNextIndex = scanner.hasNextInt();
        System.out.println("Enter Value which you want to insert");
        boolean isHasNextValue = scanner.hasNextInt();
        if (isHasNextIndex && isHasNextValue) {
            int index = scanner.nextInt();
            int value = scanner.nextInt();
            myArray = insertElement(myArray, index, value);
        } else {
            System.out.println("Entered Invalid Values. Try again..");
        }
        return myArray;
    }

    private Integer[] insertElement(Integer[] myArray, int index, int value) {
        if (index >= myArray.length) {
            System.out.println("Entered index for inserting value is out of limit. Can't insert value.");
            return myArray;
        }
        int emptyIndex = getEmptyIndex(myArray);
        if (emptyIndex == -1) {
            System.out.println("Array is full,No space to enter new value");
        } else {
            if (index > emptyIndex) {
                System.out.printf("We found an empty location at index %d, so inserting value at it instead of %d\n", emptyIndex, index);
                index = emptyIndex;
            }
            for (int i = emptyIndex; i > index; i--) {
                myArray[i] = myArray[i - 1];
            }
            myArray[index] = value;
        }
        return myArray;
    }

    private Integer[] updateElementByIndex(Integer[] myArray) {
        System.out.println("Enter index where you want to update value");
        boolean isHasNextIndex = scanner.hasNextInt();
        System.out.println("Enter Value which you want to update");
        boolean isHasNextValue = scanner.hasNextInt();
        if (isHasNextIndex && isHasNextValue) {
            int index = scanner.nextInt();
            int value = scanner.nextInt();
            myArray = updateElementByIndex(myArray, index, value);
        } else {
            System.out.println("Entered Invalid Values. Try again..");
        }
        return myArray;
    }

    private Integer[] updateElementByIndex(Integer[] myArray, int index, Integer value) {
        if (index >= myArray.length) {
            System.out.println("index is out of bound....  Try again ");
        } else {
            myArray[index] = value;
        }
        return myArray;
    }

    private Integer[] updateElementByValue(Integer[] myArray) {
        System.out.println("Enter value which you want to update");
        boolean isHasNextValue = scanner.hasNextInt();
        System.out.println("Enter a new value");
        boolean isHasNextNewValue = scanner.hasNextInt();
        if (isHasNextValue && isHasNextNewValue) {
            int value = scanner.nextInt();
            Integer newValue = scanner.nextInt();
            myArray = updateElementByValue(myArray, value, newValue);
        } else {
            System.out.println("Entered Invalid Values. Try again..");
        }
        return myArray;
    }

    private Integer[] updateElementByValue(Integer[] myArray, Integer value, Integer newValue) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == value) {
                myArray = updateElementByIndex(myArray, i, newValue);
            }
        }
        return myArray;
    }

    private Integer[] deleteElementByValue(Integer[] myArray) {
        System.out.println("Enter value that you want to delete");
        boolean isHasNextValue = scanner.hasNextInt();
        if (isHasNextValue) {
            int value = scanner.nextInt();
            myArray = deleteElementByValue(myArray, value);
        } else {
            System.out.println("Entered Invalid Values. Try again..");
        }
        return myArray;
    }

    private Integer[] deleteElementByValue(Integer[] myArray, Integer value) {
        for (int i = 0; i < myArray.length; i++) {
            if (value == myArray[i]) {
                myArray = deleteElementByIndex(myArray, i);
            }
        }
        return myArray;
    }

    private Integer[] deleteElementByIndex(Integer[] myArray) {
        System.out.println("Enter index that you want to delete.");
        boolean isHasNextIndex = scanner.hasNextInt();
        if (isHasNextIndex) {
            int index = scanner.nextInt();
            myArray = deleteElementByIndex(myArray, index);
        } else {
            System.out.println("Entered Invalid Values. Try again..");
        }
        return myArray;
    }

    private Integer[] deleteElementByIndex(Integer[] myArray, Integer index) {
        if (index > myArray.length) {
            System.out.println("Given index is out of bound, Cant be deleted");
        } else {
            for (int i = index; i < myArray.length - 1; i++) {
                myArray[i] = myArray[i + 1];
            }
            myArray[myArray.length - 1] = null;
        }
        return myArray;
    }

    private int getEmptyIndex(Integer[] myArray) {
        int emptyIndex = -1;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == null) {
                emptyIndex = i;
                break;
            }
        }
        return emptyIndex;
    }
}
