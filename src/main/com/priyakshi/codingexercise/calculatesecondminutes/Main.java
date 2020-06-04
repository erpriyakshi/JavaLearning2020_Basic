package com.priyakshi.codingexercise.calculatesecondminutes;

public class Main {
    public static void main(String[] args) {
        SecondsAndMinutesChallenge secondsAndMinutesChallenge = new SecondsAndMinutesChallenge();
        String timeCalculation = secondsAndMinutesChallenge.getDurationString(30, 1);
        System.out.println(timeCalculation);
        String minutesCalculation = secondsAndMinutesChallenge.getDurationString(50);
        System.out.println(minutesCalculation);
    }
}
