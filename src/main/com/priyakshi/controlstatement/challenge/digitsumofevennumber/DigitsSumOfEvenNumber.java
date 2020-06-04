package com.priyakshi.controlstatement.challenge.digitsumofevennumber;

public class DigitsSumOfEvenNumber {
    public int digitsSumOfEvenNumber(int number) {
        int sum = 0;
        number = Math.abs(number);
        while (number > 0) {
            int reminder = number % 10;
            number = number / 10;
            if(reminder%2==0){
                sum = sum + reminder;
            }
        }
        return sum;
    }
}
