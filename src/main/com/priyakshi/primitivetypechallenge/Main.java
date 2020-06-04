package com.priyakshi.primitivetypechallenge;

public class Main {
    public static void main(String[] args) {
//        byte bytevalue = 10;
//        short shortvalue = 20;
//        int intvalue = 50;
//        long longtotal = 50000 + 10 *(bytevalue + shortvalue + intvalue);
//        System.out.println(longtotal);
        double noOfPounds = 5;
        double onePoundInKilogram = 0.45359237;
        double valueInKilogram = noOfPounds * onePoundInKilogram;
        System.out.println("No of kilograms = " + valueInKilogram);
        char myUniCodeValue = '\u0041';
        char myUnicodevlaue2 = '\u00A9' ;
        for (int i = 0; i < 26; i++) {
            System.out.print(myUniCodeValue++);
        }
        System.out.println(myUnicodevlaue2);



    }
}
