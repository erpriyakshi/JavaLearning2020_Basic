package com.priyakshi.codingexercise.equalsumchecker;

public class EqualSumChecker {
    public boolean hasEqualSum(int a, int b, int c) {
        int sumOfaAndb = a + b;
        if (c == sumOfaAndb) {
            return true;

        } else {
            return false;
        }
    }
}
