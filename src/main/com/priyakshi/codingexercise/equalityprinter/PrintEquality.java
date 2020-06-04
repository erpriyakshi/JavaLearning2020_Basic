package com.priyakshi.codingexercise.equalityprinter;

public class PrintEquality {
    public void printEqual(int first, int second, int third) {
        if (first > 0 || second > 0 || third > 0) {
            if ((first == second) && (second == third) && (third == first)) {
                System.out.println("All numbers are equal");
            } else if ((first != second) && (second != third) && (third != first)) {
                System.out.println("All numbers are diffrent");
            } else {
                System.out.println("Neither all are equal or diffrent");
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}
