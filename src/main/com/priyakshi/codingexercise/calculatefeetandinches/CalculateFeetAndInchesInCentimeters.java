package com.priyakshi.codingexercise.calculatefeetandinches;

public class CalculateFeetAndInchesInCentimeters {
    public int calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) || (inches >= 0 && inches <= 12)) {
            double convertFeetIntoInches = feet * 12 + inches;
            double convertInchesintoCentimerter = convertFeetIntoInches * 2.54;
            int feetAndInchesResultIntoCentimerts = (int) convertInchesintoCentimerter;
            return feetAndInchesResultIntoCentimerts;
        }
        return -1;
    }

    public double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double calculateInchesInToFeet = inches / 12;
            int resultOfFeetCalculation = (int) calculateInchesInToFeet;
            System.out.println(resultOfFeetCalculation);
            return resultOfFeetCalculation;
        }
        return -1;
    }

    public void calcFeetAndInchesToCentimeters(String inches) {

    }
}
