package com.sumitchallenge.vowelsandconsonent;

public class CharacterTypeFinder {
    public boolean isVowel(String character) {
        if (character.equalsIgnoreCase("a") || character.equalsIgnoreCase("e")
                || character.equalsIgnoreCase("i") || character.equalsIgnoreCase("o")
                || character.equalsIgnoreCase("u")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isVowelUsingRegex(String character) {
        String vowelRegex = "[aieou]";
        return character.matches(vowelRegex);
    }

    public boolean isAlphabetUsingRegex(String character) {
        String alphabetRegex = "[A-Za-z]";
        return character.matches(alphabetRegex);
    }

    public boolean isAlphabet(String character) {
        char chr = character.charAt(0);
        if ((chr >= 'A' && chr <= 'Z') || (chr >= 'a' && chr <= 'z')) {
            return true;
        }
        //if ((chr >= 65 && chr <= 90) || (chr >= 97 && chr <= 122)) {
        //    return true;
        //}
        return false;
    }

}
