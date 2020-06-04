package com.priyakshi.methodchallenge;

public class Player {
    private String name;
    private String team;
    private int highScore;
    private int position;

    public Player(String name, String team, int highScore, int position) {
        this.name = name;
        this.team = team;
        this.highScore = highScore;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getHighScore() {
        return highScore;
    }

    public int getPosition() {
        return position;
    }
}
