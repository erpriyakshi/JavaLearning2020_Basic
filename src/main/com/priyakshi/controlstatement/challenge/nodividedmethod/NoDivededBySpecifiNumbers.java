package com.priyakshi.controlstatement.challenge.nodividedmethod;

public class NoDivededBySpecifiNumbers {
    public boolean isDividedByThreeAndFive(int number) {
        int reminderOfDivisonByFifteen = number % (3*5);
        if (reminderOfDivisonByFifteen == 0) {
            return true;
        }
        return false;
    }
    public void sumAllNumbersInGivenRange(int start, int end) {
        int totalNumber = 0;
        for (int number = start; number <= end; number++) {

            if (isDividedByThreeAndFive(number)) {
                System.out.println(number + " is a divided by 3 & 5");
                totalNumber++;
                if (totalNumber >= 5) {
                    break;
                }
            }
        }
        System.out.println("Total  sum = " + totalNumber);
    }
}
