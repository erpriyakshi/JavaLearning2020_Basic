package com.priyakshi.codingexercise.barking;

public class Main {
    public static void main(String[] args) {
        BarkingDog barkingDog = new BarkingDog();
       boolean shouldWakeUp = barkingDog.shouldWakeUp(false,18);
        System.out.println(shouldWakeUp);

    }
}
