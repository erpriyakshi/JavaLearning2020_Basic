package com.priyakshi.sumitchallenge.factorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FindFactorial findFactorial = new FindFactorial();
        Scanner scanner = new Scanner(System.in);
        // loop
        System.out.println("Enter Number");
        boolean isHasNext = scanner.hasNext();
        if(isHasNext){
            int number = scanner.nextInt();
            double factorial = findFactorial.findFactorial(number);
            System.out.println("Factorial is "+ factorial);
        }
        // Factorial is 2.6525285981219103E32 - Read about E in given representation and teach sumit
    }
}
