package com.priyakshi.sumitchallenge.numberwithpower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalculationOfPowerNumber calculationOfPowerNumber=new CalculationOfPowerNumber();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Number");
        boolean ishasNumber = scanner.hasNext();
        System.out.println("Enter power");
        boolean ishasPower = scanner.hasNext();
        if(ishasNumber && ishasPower){
            int number = scanner.nextInt();
            int power = scanner.nextInt();
            int resultOfPowerNumber = calculationOfPowerNumber.getResultOfPowerNumber(number, power);
            System.out.println("Result is "+ resultOfPowerNumber);
        }
    }
}
