package com.priyakshi.controlstatement.challenge.perfectnumber;

public class Main {
    public static void main(String[] args) {
        int number = 6;
        PerFectNumberFinder perFectNumberFinder = new PerFectNumberFinder();
        boolean isPerfectNumber = perFectNumberFinder.isPerfectNumber(number);
        if (isPerfectNumber) {
            System.out.println(number + " is a perfect Number");
        } else {
            System.out.println(number + " is not a perfect Number");
        }
        perFectNumberFinder.printPerfectNumber(1,1000);
    }
}
