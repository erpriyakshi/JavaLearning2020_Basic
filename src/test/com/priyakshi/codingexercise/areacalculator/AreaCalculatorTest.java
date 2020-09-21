package com.priyakshi.codingexercise.areacalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AreaCalculatorTest {

    @Test
    public void testCalculateCircleArea_withNegativeValue() {
        //Given
        AreaCalculator testClass = new AreaCalculator();

        //When
        double result = testClass.calculateArea(-2);

        //Then
        assertEquals(-1, result, 0);
    }

    @Test
    public void testCalculateCircleArea_withPositiveValue() {
        //Given
        AreaCalculator testClass = new AreaCalculator();
        //When
        double result = testClass.calculateArea(3);
        //Then
        assertEquals(28.26, result, 0.1);
    }

    @Test
    public void testCalculateRectangleArea_withNegativeValues() {
        //Given
        AreaCalculator testClass = new AreaCalculator();
        //When
        double result = testClass.calculateArea(-2, 3);
        //Then
        assertEquals(-1, result, 0.1);
    }

    @Test
    public void testCalculateRectangleArea_withPositiveValues() {
        //Given
        AreaCalculator testClass = new AreaCalculator();
        //When
        double result = testClass.calculateArea(2, 3);
        //Then
        assertEquals(6, result, 0.1);
    }

}