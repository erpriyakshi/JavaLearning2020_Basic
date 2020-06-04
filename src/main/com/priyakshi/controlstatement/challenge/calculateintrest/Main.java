package com.priyakshi.controlstatement.challenge.calculateintrest;

public class Main {
    public static void main(String[] args) {
        InterestCalculation interestCalculation = new InterestCalculation();
        double amount = 11800;
        for (int i = 8; i >= 2; i--) {
            double calculateInterest = interestCalculation.calculateInterest(amount, i);
            System.out.println("Interest On " + amount + " for " + i + " = " + calculateInterest);
        }

    }
}
