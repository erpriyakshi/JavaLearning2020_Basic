package com.priyakshi.codingexercise.playingcat;

public class CatPlaying {
    public boolean isCatPlaying(boolean summer, int temperature) {
        if (!summer && (temperature >= 25 && temperature <= 35)) {
            System.out.println("Cat is playing");
            return true;
        } else if (summer && (temperature >= 25 && temperature <= 45)) {
            System.out.println("Cat is not playing");
            return false;
        }
        System.out.println("Tempreture is not in range");
        return false;
    }
}


