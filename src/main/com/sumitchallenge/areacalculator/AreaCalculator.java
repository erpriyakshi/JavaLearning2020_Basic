package com.sumitchallenge.areacalculator;

import java.util.Scanner;

public class AreaCalculator {
    public double calculateAreaForCircle(int radius) {
        double circleArea = 3.14 * radius * radius;
        return circleArea;
    }

    public double calculateAreaForSquare(int area) {
        double squareArea = area * area;
        return squareArea;
    }

    public double calculateAreaForRectangle(int length, int width) {
        double rectangleArea = length * width;
        return rectangleArea;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 0 for Exit");
            System.out.println("Enter 1 for circle area calculate");
            System.out.println("Enter 2 for square area calculate");
            System.out.println("Enter 3 for rectangle area calculate");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                if (number == 0) {
                    break;
                }
                if (number == 1) {
                    System.out.println("Enter radius of circle");
                    boolean hasNextIntRadius = scanner.hasNextInt();
                    if (hasNextIntRadius) {
                        int radius = scanner.nextInt();
                        double circleArea = calculateAreaForCircle(radius);
                        System.out.println("Circle Area is " + circleArea);
                    }
                } else if (number == 2) {
                    System.out.println("Enter side of square");
                    boolean hasNextIntSide = scanner.hasNext();
                    if (hasNextIntSide) {
                        int side = scanner.nextInt();
                        double squareArea = calculateAreaForSquare(side);
                        System.out.println("Square Area is " + squareArea);
                    }
                } else if (number == 3) {
                    System.out.println("Enter length");
                    boolean hasNextIntLength = scanner.hasNext();
                    System.out.println("Enter width");
                    boolean hasNextIntWidth = scanner.hasNext();
                    if (hasNextIntLength && hasNextIntWidth) {
                        int length = scanner.nextInt();
                        int width = scanner.nextInt();
                        double rectangleArea = calculateAreaForRectangle(length, width);
                        System.out.println("Rectangle area is " + rectangleArea);
                    }
                } else {
                    System.out.println("Invalid Choice.");
                }
            } else {
                System.out.println("Invalid Input.");
            }
            System.out.println("Press Enter to Continue..");
            scanner.nextLine();
            scanner.nextLine();
        }
    }
}
