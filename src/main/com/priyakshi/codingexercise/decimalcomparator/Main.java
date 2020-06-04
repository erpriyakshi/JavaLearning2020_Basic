package com.priyakshi.codingexercise.decimalcomparator;

public class Main {
    public static void main(String[] args) {
        DecimalComparator decimalComparator = new DecimalComparator();
        boolean areEqualByThreeDecimalPlaces = decimalComparator.areEqualByThreeDecimalPlaces(12.3456, 12.3456);
        System.out.println(areEqualByThreeDecimalPlaces);
    }
}
