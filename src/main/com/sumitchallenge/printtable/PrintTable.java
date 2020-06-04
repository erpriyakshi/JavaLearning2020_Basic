package com.sumitchallenge.printtable;

public class PrintTable {
    public void printTable(int number) {
        if (number > 0) {
            for (int i = 1; i <= 10; i++) {
                // number * 1;
                System.out.println(number + " * " + i + " = " + number * i);
            }
        }else {
            System.out.println("invalid number");
        }
    }
}
