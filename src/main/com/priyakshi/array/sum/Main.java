package com.priyakshi.array.sum;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {12, 43, 456, 5765};
        ArraySum arraySum=new ArraySum();
        int sum = arraySum.sumOfArray(intArray);
        System.out.printf("Sum of Array is %2d", sum);
    }

}
