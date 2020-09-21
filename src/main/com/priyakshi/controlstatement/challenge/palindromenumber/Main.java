package com.priyakshi.controlstatement.challenge.palindromenumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PalindromeNumberFinder palindromeNumber = new PalindromeNumberFinder();
        int reverseNumber = palindromeNumber.reverseNumber(123);
        System.out.println("Reverse Number is " + reverseNumber);
        boolean palindromeNumber1 = palindromeNumber.isPalindromeNumber(-11);
        System.out.println(palindromeNumber1);

        // wap to create an palindrome based on input.
        // input - output
        // 0     -  ""
        // 1     -  1
        // 2     -  212
        // .............
        // 7     -  7654321234567

        PalindromeNumberCreator palindromeNumberCreator = new PalindromeNumberCreator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = scanner.nextInt();
        long palindrome = palindromeNumberCreator.create(number);
        System.out.println("Palindrome of " + number + " is " + palindrome);


    }
}
