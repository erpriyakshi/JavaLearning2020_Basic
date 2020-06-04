

package com.priyakshi.controlstatement.challenge.userinput;

import java.util.Scanner;

public class MinAndMaxChallenge {
    public void printMinAndMaximum() {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;
        while (true) {
            System.out.println("Enter Number ");
            boolean isNextInt = scanner.hasNextInt();
            if (isNextInt) {
                int number = scanner.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if(number>max){
                    max =number;
                }
                if(number<min){
                    min =number;
                }

            } else {
                break;
            }
        }
        System.out.println("Minimum no is "+ min+ " and maximum no is "+ max);
    }
}
