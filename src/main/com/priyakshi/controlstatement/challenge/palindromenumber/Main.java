package com.priyakshi.controlstatement.challenge.palindromenumber;

public class Main {
    public static void main(String[] args) {
        PalindromeNumberFinder palindromeNumber= new PalindromeNumberFinder();
        int reverseNumber = palindromeNumber.reverseNumber(123);
        System.out.println("Reverse Number is "+ reverseNumber);
        boolean palindromeNumber1 = palindromeNumber.isPalindromeNumber(-11);
        System.out.println(palindromeNumber1);

    }
}
