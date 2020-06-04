package com.priyakshi.controlstatement.challenge.flourpackproblem;

public class FlourPack {
    public boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount >= 0 && smallCount >= 0 && goal >= 0) {
            int possibleBigCount = goal / 5;
            // ternary operator : condition ? value_if_true : value_if_false
            int fullfillBigCount = bigCount >= possibleBigCount ? possibleBigCount : bigCount;
            // if else
//            int fullfillBigCount;
//            if (bigCount >= possibleBigCount) {
//                fullfillBigCount = possibleBigCount;
//            } else {
//                fullfillBigCount = bigCount;
//            }
            int remainingGoalAfterBig = goal - fullfillBigCount * 5;

            int possibleSmallCount = remainingGoalAfterBig / 1;
            int fulfillSmallCount = smallCount >= possibleSmallCount ? possibleSmallCount : smallCount;
            int remainingGoalAfterSmall = remainingGoalAfterBig - fulfillSmallCount * 1;

            if (remainingGoalAfterSmall == 0) {
                return true;
            }
            return false;
        }
        System.out.println("Negative");
        return false;
    }
}
