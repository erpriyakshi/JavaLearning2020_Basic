package com.priyakshi.codingexercise.speed;

public class SpeedConverter {
    public long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("This Is a invalid Value");
            return -1;
        } else {
            long milesPerHour = Math.round(0.6 * kilometersPerHour);
            System.out.println(milesPerHour);
            return milesPerHour;
        }
    }
}
