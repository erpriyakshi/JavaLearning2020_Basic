package com.priyakshi.sumitchallenge.altenateprimenumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AlternatePrimeNumber alternatePrimeNumber = new AlternatePrimeNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start");
        boolean isHasNextStart = scanner.hasNext();
        System.out.println("Enter end");
        boolean isHasNextEnd = scanner.hasNext();
        if (isHasNextStart && isHasNextEnd) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            alternatePrimeNumber.alternatePrimeNumber(start, end);
        }
    }
}
