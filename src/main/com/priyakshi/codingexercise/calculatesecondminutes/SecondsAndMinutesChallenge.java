package com.priyakshi.codingexercise.calculatesecondminutes;

public class SecondsAndMinutesChallenge {
    public String getDurationString(long minutes, long seconds) {
        if ((minutes >= 0) || (seconds >= 0 && seconds <= 59)) {
            long calculateHour = minutes / 60;
            long remaningMinutes = minutes % 60;
            long calculateMinutes = seconds / 60;
            long remainingSeconds = seconds % 60;
            return calculateHour + " h " + remaningMinutes + " m " + remainingSeconds + " s ";
        }
        return "invalid value";
    }

    public String getDurationString(int seconds) {
        if (seconds >= 0) {
            int calculateMinutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return calculateMinutes + " m " + remainingSeconds + " s ";


        } else {
            return "invalid value";
        }
    }
}
