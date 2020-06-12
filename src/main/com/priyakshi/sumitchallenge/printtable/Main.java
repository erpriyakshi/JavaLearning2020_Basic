package com.priyakshi.sumitchallenge.printtable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrintTable printTable = new PrintTable();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number");
        boolean isHasNext = scanner.hasNext();
        if (isHasNext) {
            int number = scanner.nextInt();
            printTable.printTable(number);
        }
    }
}
