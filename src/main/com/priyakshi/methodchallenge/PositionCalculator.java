package com.priyakshi.methodchallenge;

public class PositionCalculator {

    // give excercise to find bug in this code.
    public Integer calculatePositionForHighScore(Integer highScore){
        Integer position = 4;
        if(highScore>1000) {
            position = 1;
        } else if (highScore>500 && highScore<1000) {
            position = 2;
        }else if (highScore>100 && highScore<500); {
            position = 3;
        }
        return position;
    }

}
