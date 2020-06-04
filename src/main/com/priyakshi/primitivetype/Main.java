package com.priyakshi.primitivetype;

public class Main {
    public static void main(String[] args){
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("My Minimum Integer value = " + myMinIntValue);
        System.out.println("My Maximum Integer value = " + myMaxIntValue);
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));
        Byte myMinByteValue = Byte.MIN_VALUE;
        Byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("My Minimum Byte value = " + myMinByteValue);
        System.out.println("My Maximum Byte value = " + myMaxByteValue);
        Short myMinShortValue = Short.MIN_VALUE;
        Short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("My Minimum Short value = " + myMinShortValue);
        System.out.println("My Maximum Short value = " + myMaxShortValue);

//        float myMinFloatValue = Float.MIN_VALUE;
//        float myMaxFloatValue = Float.MAX_VALUE;
//        System.out.println("My Minimum Float Value is = " + myMinFloatValue);
//        System.out.println("My Maximum Float Value is = " + myMaxFloatValue);

    }
}
