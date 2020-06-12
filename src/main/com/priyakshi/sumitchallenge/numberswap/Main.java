package com.priyakshi.sumitchallenge.numberswap;

public class Main {

    public static void main(String[] args) {
        NumberSwapper numberSwapper = new NumberSwapper();
        int firstNumber = 18; // 11000
        int secondNumber = 79; // 11004
        // java uses pass by value approach.
        numberSwapper.swapNumbers(firstNumber, secondNumber);
        System.out.println("first Number : " + firstNumber);
        System.out.println("Second Number : " + secondNumber);
    }
}
