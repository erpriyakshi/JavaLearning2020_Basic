package com.priyakshi.main.programarguments;

public class Main {

    // Question: print name of n length in args as parameter
    public static void main(String[] args) {
        // java
        if (args.length <  1) {
            throw new RuntimeException("Please provide your name to run this program");

        }
        System.out.print("Hello ");
        for (int i = 0; i < args.length; i++) {
            System.out.print( args[i] + " ");
        }

        //System.out.println(args.length);

    }
}
