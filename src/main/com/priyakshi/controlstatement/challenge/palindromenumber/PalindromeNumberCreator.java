package com.priyakshi.controlstatement.challenge.palindromenumber;

public class PalindromeNumberCreator {

    public long create(int number) {
        long palindromeNumber = 0;
        for (int i = number; i >= 1; i--) {
            palindromeNumber = palindromeNumber * 10 + i;
        }
        for (int j = 1; j <= number; j++) {
            palindromeNumber = palindromeNumber * 10 + j;

        }

        return palindromeNumber;

    }
}
