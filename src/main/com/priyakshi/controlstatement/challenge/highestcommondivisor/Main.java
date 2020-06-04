package com.priyakshi.controlstatement.challenge.highestcommondivisor;

public class Main {
    public static void main(String[] args) {
        HighestCommonDivisorFinder highestCommonDivisorFinder = new HighestCommonDivisorFinder();
        int highestCommonDivisor = highestCommonDivisorFinder.findHighestCommonDivisor(12, 22);
        System.out.println("Highest Common Divisor is "+ highestCommonDivisor);
    }
}
