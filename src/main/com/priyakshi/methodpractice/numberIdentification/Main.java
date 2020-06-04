package com.priyakshi.methodpractice.numberIdentification;

public class Main {

    public static void main(String[] args) {
        NumberIdentification numberIdentificatio = new NumberIdentification();
        numberIdentificatio.checkNumber(6);
        numberIdentificatio.checkNumber(-4);
        numberIdentificatio.checkNumber(0);

//        Number is Positive - SP - 1 LV - 1
        // SP - 1, LV - 0
//        Number is Negative - SP - 2, LV - 1
        // SP - 2, LV - 0
//        Number is equal to 0 - SP - 3, LV - 1
        // SP - 3, LV - 0

    }
}
