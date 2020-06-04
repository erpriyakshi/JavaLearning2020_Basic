package com.priyakshi.controlstatement.challenge.sumodd;

public class Main {
    public static void main(String[] args) {
        SumOdd sumOdd = new SumOdd();
        //boolean odd = sumOdd.isOdd(4);
        // System.out.println(odd);
        // int sumOfOddNumbers = sumOdd.sumOdd(-10,3);
        //System.out.println(sumOfOddNumbers);
        boolean even = sumOdd.isEvenNumber(17);
        System.out.println("Numbe is even Number " + even);

        int count = 0;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 0;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }


        count = 6;
        while (count < 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 6;
        do {
            count++;
            System.out.println("Count value is " + count);
        } while (count < 6);

        int start = 4;
        int finish = 20;
        int evenNumberCount = 0;
        while (start < finish) {
            start++;
            if (!sumOdd.isEvenNumber(start)) {
                continue;
            }
            System.out.println(start + " Number is Even");
            evenNumberCount = evenNumberCount + 1;
            if (evenNumberCount == 5) {
                break;
            }
        }
        System.out.println("Total Even numbers are " + evenNumberCount);

    }
}
