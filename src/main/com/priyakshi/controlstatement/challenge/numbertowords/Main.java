package com.priyakshi.controlstatement.challenge.numbertowords;

public class Main {
    public static void main(String[] args) {
        NumberToWords numberToWords= new NumberToWords();
        String words = numberToWords.convertNumberintoWords(-888);
        System.out.println(words);
    }
}
