package com.priyakshi.controlstatement.challenge.flourpackproblem;

import javax.swing.*;

public class FlourPackTest {
    public boolean canPack(int bigCount, int mediumCount, int smallCount, int goal) {
        if (bigCount >= 0 && mediumCount >= 0 && smallCount >= 0 && goal >= 0) {
            int remaingGoalAfterBig = getRemainingGoal(goal, 5, bigCount);
            int remainingGoalAfterMedium = getRemainingGoal(remaingGoalAfterBig, 3, mediumCount);
            int remaingGoalAftersmall = getRemainingGoal(remainingGoalAfterMedium, 2, smallCount);
            if (remaingGoalAftersmall >= 0) {
                return true;
            }
            return false;
        }
        System.out.println("Negative");
        return false;
    }

    private int getRemainingGoal(int goal, int bagsize, int bagcount) {
        int possibleBagCount = goal / bagsize;
        int fullfillBagCount = bagcount >= possibleBagCount ? possibleBagCount : bagcount;
        int remaingGoal = goal - fullfillBagCount * bagsize;
        return remaingGoal;

    }
}
