package com.priyakshi.codingexercise.speed;

public class Main {
    public static void main(String[] args) {
        SpeedConverter speedConverter = new SpeedConverter();
        speedConverter.toMilesPerHour(6);
        speedConverter.toMilesPerHour(-4);
        speedConverter.toMilesPerHour(1.5);
        speedConverter.toMilesPerHour(10.25);
        speedConverter.toMilesPerHour(Math.round(0.49));
        speedConverter.toMilesPerHour(Math.random());
    }
}
