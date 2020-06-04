package com.priyakshi.codingexercise.leapyearcalculator;

public class LeapYear {
    public boolean isLeapYear(int year) {
        if (year >= 1 || year <= 9999) {
            int reminderOfDivideBy4 = year % 4;
            if (reminderOfDivideBy4 == 0) {
                int reminderOfDivideBy100 = year % 100;
                if (reminderOfDivideBy100 != 0) {
                    return true;
                }
                int reminderOfDivideBy400 = year % 400;
                if (reminderOfDivideBy400 == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    //Leap Year By switch
    public boolean isLepaYearCalculation(int year) {
        switch (year % 4) {
            case 0:
                switch (year % 100) {
                    case 0:
                        switch (year % 400) {
                            case 0:
                                return true;
                            default:
                                return false;
                        }
                    default:
                        return true;
                }
            default:
                return false;
        }

    }
}
