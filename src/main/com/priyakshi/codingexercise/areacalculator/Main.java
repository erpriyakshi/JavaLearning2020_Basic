package com.priyakshi.codingexercise.areacalculator;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        double areaOfCircle = areaCalculator.calculateArea(6);
        double areaOfRectangle = areaCalculator.calculateArea(10,4);
        System.out.println("Area of Circle = " + areaOfCircle);
        System.out.println("Area of Rectangle = " + areaOfRectangle);
    }
}
