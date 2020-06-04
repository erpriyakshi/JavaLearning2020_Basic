package com.priyakshi.codingexercise.leapyearcalculator;

public class Main {
    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
       boolean isLeapYear = leapYear.isLeapYear(2022);
       /*if(isLeapYear) {
           System.out.println("It's a leap year");
       } else {
           System.out.println("It's not a leap year");
       }*/

        isLeapYear = leapYear.isLepaYearCalculation(2000);
        if(isLeapYear) {
            System.out.println("It's a leap year");
        } else {
            System.out.println("It's not a leap year");
        }
    }

}
