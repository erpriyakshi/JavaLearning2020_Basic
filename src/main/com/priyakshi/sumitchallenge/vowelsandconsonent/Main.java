package com.priyakshi.sumitchallenge.vowelsandconsonent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write code for 3 loops and complete isAlphabet code.
        CharacterTypeFinder characterTypeFinder = new CharacterTypeFinder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a alphabet");
        String character = scanner.next();
        if (character.length() == 1 && characterTypeFinder.isAlphabet(character)) {
            if(characterTypeFinder.isVowel(character)){
                System.out.println("Entered string is a vowel!");
            }else{
                System.out.println("Entered String is a consonant");
            }
        }else{
            scanner.nextLine();
            System.out.println("invalid string");
        }
    }
}
