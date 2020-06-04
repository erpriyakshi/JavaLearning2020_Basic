package com.priyakshi.codingexercise.equalsumchecker;

public class Main {
    public static void main(String[] args) {
        EqualSumChecker equalSumChecker = new EqualSumChecker();
       boolean hasEqualSum =  equalSumChecker.hasEqualSum(1,1,1);
       if(hasEqualSum){
           System.out.println("a + b equal to c");
       }else{
           System.out.println("a + b not equal to c");
       }
    }
}
