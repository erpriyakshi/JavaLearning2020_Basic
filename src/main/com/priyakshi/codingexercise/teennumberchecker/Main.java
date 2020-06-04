package com.priyakshi.codingexercise.teennumberchecker;

public class Main {
    public static void main(String[] args) {
        TeenNumberchecker teenNumberchecker = new TeenNumberchecker();
        boolean hasteen = teenNumberchecker.hasTeen(10,11,13);
        if(hasteen){
            System.out.println("Number is Teen Number");
        }else{
            System.out.println("Number is Not Teen Number");
        }
    }
}
