package com.priyakshi.controlstatement.challenge.shareddigit;

public class SharedDigitsFinder {
    public boolean hasSharedDigit(int firstNumber, int secondNumber) {
        int sharedDigit = 0;
        while (firstNumber > 0) {
            int firstReminder = firstNumber % 10;
            firstNumber = firstNumber / 10;
           int secondNumberTemp = secondNumber;
            while (secondNumberTemp > 0) {
                int secondReminder = secondNumberTemp % 10;
                secondNumberTemp = secondNumberTemp/10;
                if(firstReminder==secondReminder){
                    sharedDigit =firstReminder;
                    System.out.println("Shared digit is "+ sharedDigit);
                    return true;
                }
            }
        }
        return false;


    }

}
