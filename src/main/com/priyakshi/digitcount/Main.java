package com.priyakshi.digitcount;

public class Main {
    public static void main(String[] args) {
        DigitCount digitCount=new DigitCount();
        int count = digitCount.digitCount(-103);
        System.out.println("Total Digit is "+ count);

        //  count digit for number 00010
        String number = "00010";
        System.out.println(number.length());
    }
}
