package com.priyakshi.methodchallenge;

public class HighScorePositionDisplay {

    public static void displayHighScorePosition(Player player){
        System.out.println("Player Name: " + player.getName());
        System.out.println("Player Team: " + player.getTeam());
        System.out.println("Player Highscore: " + player.getHighScore());
        System.out.println("Player Position: " + player.getPosition());
    }
}
