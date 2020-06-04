package com.priyakshi.controlstatement.challenge.primenumber;

public class Main {
    public static void main(String[] args) {
        PrimeNumberCalculator primeNumberCalculator = new PrimeNumberCalculator();
        boolean primeNumber = primeNumberCalculator.isPrimeNumber(11);
        System.out.println(primeNumber);
        primeNumberCalculator.printAllPrimeNumbersInGivenRange(2,21);
    }
}
