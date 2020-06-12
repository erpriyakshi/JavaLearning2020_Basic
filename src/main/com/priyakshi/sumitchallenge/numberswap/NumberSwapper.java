package com.priyakshi.sumitchallenge.numberswap;

public class NumberSwapper {
    public void swapNumbers(int firstNumber, int secondNumber) {
        // 11400  // 11404
        System.out.println("first Number : " + firstNumber);
        System.out.println("Second Number : " + secondNumber);
        // using third variable, temp
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("first Number : " + firstNumber);
        System.out.println("Second Number : " + secondNumber);

        // without using third variable.(3, 4)
        firstNumber = firstNumber + secondNumber; // 3 + 4 = 7
        secondNumber = firstNumber - secondNumber; // 7 - 4 = 3
        firstNumber = firstNumber - secondNumber; // 7 - 3 = 4

        System.out.println("first Number : " + firstNumber);
        System.out.println("Second Number : " + secondNumber);

        // using third variable, temp
        int temp1 = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp1;

        System.out.println("first Number : " + firstNumber);
        System.out.println("Second Number : " + secondNumber);

    }
}
