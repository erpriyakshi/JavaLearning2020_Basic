package com.priyakshi.codingexercise.minutestoyearanddayscalculator;

public class CalculateYearsAndDaysByMinutes {
    public void printYearAndDays(long minutes){
        if(minutes>0){
            long hours = minutes/60;
            long days = hours/24;
            long years = days / 365;
            long remainingDays = days % 365;
            System.out.println(minutes + " Min = " + years + "y And "+ remainingDays +"d");
        }else{
            System.out.println("Invalid Value");
        }
    }
}
