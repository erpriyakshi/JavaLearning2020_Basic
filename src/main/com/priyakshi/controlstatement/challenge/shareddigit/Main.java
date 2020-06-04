package com.priyakshi.controlstatement.challenge.shareddigit;

public class Main {
    public static void main(String[] args) {
        SharedDigitsFinder sharedDigitsFinder= new SharedDigitsFinder();
        boolean hasSharedDigit = sharedDigitsFinder.hasSharedDigit(231, 4592);
        System.out.println(" Number is shared " + hasSharedDigit);
    }
}
