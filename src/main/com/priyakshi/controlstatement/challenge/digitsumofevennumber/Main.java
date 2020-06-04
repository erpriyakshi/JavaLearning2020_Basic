package com.priyakshi.controlstatement.challenge.digitsumofevennumber;

public class Main {
    public static void main(String[] args) {
        int number = 2468;
        DigitsSumOfEvenNumber digitsSumOfEvenNumber = new DigitsSumOfEvenNumber();
        int evenNumberDigitsSum = digitsSumOfEvenNumber.digitsSumOfEvenNumber(number);
        System.out.println(" Even Number sum Of " + number + " digit is = " + evenNumberDigitsSum);
    }
}
