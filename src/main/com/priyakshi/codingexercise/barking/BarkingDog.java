package com.priyakshi.codingexercise.barking;

public class BarkingDog {
    public boolean shouldWakeUp(boolean barking, int hourOfTheDay) {
        if (barking == true) {
            if (hourOfTheDay >= 18 || hourOfTheDay <= 6) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
