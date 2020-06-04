package com.priyakshi.methodchallenge;

public class PlayerCreator {
    PositionCalculator positionCalculator = new PositionCalculator();

    public Player createPlayer(String name, String team, int highScore) {
        int position = positionCalculator.calculatePositionForHighScore(highScore);
        Player player = new Player(name, team, highScore, position);
        return  player;
    }
}
