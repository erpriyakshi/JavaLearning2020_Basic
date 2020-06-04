package com.priyakshi.controlstatement.challenge.diagonalstar;

import java.util.Scanner;

public class Main {
    // TODO: 2nd May 2020 - priyakshi - come back to this problem later in time.
    public static void main(String[] args) {
        DiagonalStar diagnoalStar = new DiagonalStar();
        diagnoalStar.print(5);
        printSeprator();
        printSeprator();
        diagnoalStar.printCompleteSquare(5);
        printSeprator();
        printSeprator();
        diagnoalStar.printSquarePerimeter(5);
        printSeprator();
        printSeprator();
        diagnoalStar.printDiagonalStar(5);
        
    }

    private static void printSeprator() {
        System.out.println("----------------------------------------------------");
    }
}
