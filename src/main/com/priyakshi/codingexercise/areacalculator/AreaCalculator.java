package com.priyakshi.codingexercise.areacalculator;

public class AreaCalculator {
    public double calculateArea(double radius) {
        if (radius > 0) {
            double areaOfCircle = 3.14 * (radius * radius);
            return areaOfCircle;
        }
        return -1.0;
    }
        public double calculateArea(double length,double Breadth){
            if (length > 0 && Breadth > 0) {
                double areaOfRectangle = length * Breadth;
                return areaOfRectangle;
            }
            return -1.0;

        }
    }
