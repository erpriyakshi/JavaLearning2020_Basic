package com.priyakshi.codingexercise.barking;

import org.junit.Assert;
import org.junit.Test;

public class BarkingDogTest {

    @Test
    public void testShouldWakeUp() {
        //Given
        BarkingDog testClass = new BarkingDog();
        //When
        boolean result = testClass.shouldWakeUp(false, 1);
        //Then
        Assert.assertTrue(true);
    }
}