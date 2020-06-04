package com.priyakshi.codingexercise.teennumberchecker;

public class TeenNumberchecker {
    public boolean hasTeen(int first, int second, int third) {
        if ((first >= 13 && first <= 19) || (second >= 13 && second <= 19) || (third >= 13 && third <= 19)) {
            return true;
        } else {
            return false;
        }
    }
}
