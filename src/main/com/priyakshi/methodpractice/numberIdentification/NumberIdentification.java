package com.priyakshi.methodpractice.numberIdentification;

public class NumberIdentification {

    public  void checkNumber(int number) {
        String msg = null;
        if (number > 0) {
             msg = "Number is Positive";
        } else if (number < 0) {
            msg = "Number is Negative";
        } else if (number == 0) {
            msg = "Number is equal to 0";
        }
        System.out.println(msg);
    }



    public static void printConversation(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("This Is a invalid Value");
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = kiloBytes / 1000;
        System.out.println(megaBytes);
    }

    public static boolean shouldWakeUp(boolean barking, int hourofDay) {
        boolean result = false;
        if(hourofDay<0 || hourofDay>23){
            System.out.println("Ist Condition");
            return false;
        }
        else if(hourofDay>=8 && hourofDay <= 22){
            System.out.println("2nd Condition");
            result =false;
        }else if (hourofDay >= 1 || hourofDay <=7 || hourofDay >=23){
            if(barking == true){
                System.out.println("3rd Condition");
                result = true;
            }
            else {
                System.out.println("4th Condition");
                result = false;
            }
        }
        return result;

    }


}
