package com.priyakshi.methodchallenge;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        String playerName1 = "Sumit Singh";
        int highScore1 = 1500;
        int position1 = calculatedHighScorePosition(highScore1);
        displayHighScorePosition(playerName1, highScore1, position1);

        String playerName2 = "Priyakshi";
        int highScore2 = 900;
        int position2 = calculatedHighScorePosition(highScore2);
        displayHighScorePosition(playerName2, highScore2, position2);


        String playerName3 = "Jeenu";
        int highScore3 = 400;
        int position3 = calculatedHighScorePosition(highScore3);
        displayHighScorePosition(playerName3, highScore3, position3);

        String playerName4 = "Himanshi";
        int highScore4 = 50;
        int position4 = calculatedHighScorePosition(highScore4);
        displayHighScorePosition(playerName4, highScore4, position4);

    }

    public static void displayHighScorePosition(String playerName, int highScore, int position) {
        System.out.println("Player Name: " + playerName);
        System.out.println("Player Highscore: " + highScore);
        System.out.println("Player Position: " + position);
    }

    public static int calculatedHighScorePosition(int playerScore){
        if(playerScore>1000) {
            return 1;
        } else if (playerScore>500 && playerScore<1000) {
            return 2;
        }else if (playerScore>100 && playerScore<500) {
            return 3;
        }else {
            return 4;
        }
    }
}
