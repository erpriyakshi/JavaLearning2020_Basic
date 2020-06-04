package com.priyakshi.controlstatement.challenge.allfactors;

public class AllFactorsFinder {
    public void findAllFactors(int number) {
        String msg = "Factors are ";
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                msg = msg + " " + i + " ";
            }
        }
        System.out.println(msg);
    }
}
