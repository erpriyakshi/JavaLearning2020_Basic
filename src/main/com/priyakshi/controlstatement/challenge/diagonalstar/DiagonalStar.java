package com.priyakshi.controlstatement.challenge.diagonalstar;

public class DiagonalStar {

    public void print(int number) {
        int lastIndex = number - 1;
        for (int rowCount = 0; rowCount < number; rowCount++) {
            for (int columnCount = 0; columnCount < number; columnCount++) {
                if (rowCount == 0 || columnCount == 0) { // seond diagonal
                    System.out.print(" *(" + columnCount + "," + rowCount + ") ");
                    //System.out.print(" * ");
                } else {
                    System.out.print("        ");
                    //System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void printCompleteSquare(int number) {
        int lastIndex = number - 1;
        for (int rowCount = 0; rowCount < number; rowCount++) {
            for (int columnCount = 0; columnCount < number; columnCount++) {
                System.out.print(" *(" + columnCount + "," + rowCount + ") ");
            }
            System.out.println();
        }
    }

    public void printSquarePerimeter(int number) {
        boolean printCoordinates = true;
        int lastIndex = number - 1;
        for (int rowCount = 0; rowCount < number; rowCount++) {
            for (int columnCount = 0; columnCount < number; columnCount++) {
                if (rowCount == 0 || columnCount == 0 // first row and first column
                        || rowCount == lastIndex || columnCount == lastIndex) { // last row and last column
                    String coordinates = printCoordinates ? "(" + columnCount + "," + rowCount + ")" : "";
                    System.out.print(" * " + coordinates + "");
                } else {
                    String coordinatesSpace = printCoordinates ? "     " : "";
                    System.out.print("   " + coordinatesSpace + "");
                }
            }
            System.out.println();
        }
    }

    public void printDiagonalStar(int number) {

        if (number >= 5) {
            boolean printCoordinates = true;
            int lastIndex = number - 1;
            for (int rowCount = 0; rowCount < number; rowCount++) {
                for (int columnCount = 0; columnCount < number; columnCount++) {
                    if (rowCount == 0 || columnCount == 0 // first row and first column
                            || rowCount == lastIndex || columnCount == lastIndex // last row and last column
                            || rowCount == columnCount // first diagonal
                            || rowCount + columnCount == lastIndex) { // seond diagonal
                        String coordinates = printCoordinates ? "(" + columnCount + "," + rowCount + ")" : "";
                        System.out.print(" * " + coordinates + "");
                    } else {
                        String coordinatesSpace = printCoordinates ? "     " : "";
                        System.out.print("   " + coordinatesSpace + "");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}



