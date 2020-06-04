package com.priyakshi.methodchallenge;

public class Main1 {
    public static void main(String[] args) {
        PlayerCreator playerCreator = new PlayerCreator();
        HighScorePositionDisplay highScorePositionDisplay = new HighScorePositionDisplay();

        Player player1 = playerCreator.createPlayer("Sumit Singh", "alpha", 1500);
        highScorePositionDisplay.displayHighScorePosition(player1);

        Player player2 = playerCreator.createPlayer("Priyakshi", "alpha", 900);
        highScorePositionDisplay.displayHighScorePosition(player2);

    }
}
