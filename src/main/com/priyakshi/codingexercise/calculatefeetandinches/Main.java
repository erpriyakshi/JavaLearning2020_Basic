package com.priyakshi.codingexercise.calculatefeetandinches;

public class Main {
    public static void main(String[] args) {
        CalculateFeetAndInchesInCentimeters calculateFeetAndInchesInCentimeters = new CalculateFeetAndInchesInCentimeters();
       double Centimertes = calculateFeetAndInchesInCentimeters.calcFeetAndInchesToCentimeters(5,3);
        double inches = calculateFeetAndInchesInCentimeters.calcFeetAndInchesToCentimeters(32);
        System.out.println(Centimertes);
        System.out.println(inches);
    }
}
