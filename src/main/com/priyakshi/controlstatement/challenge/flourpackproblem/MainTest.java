package com.priyakshi.controlstatement.challenge.flourpackproblem;

public class MainTest {
    public static void main(String[] args) {
        FlourPackTest flourPackTest= new FlourPackTest();
        boolean canPack = flourPackTest.canPack(-1, 0, 0, 0);
        System.out.println("canPack is " + canPack + " and expected value is " + false);
        canPack = flourPackTest.canPack(0, -1, 0, 0);
        System.out.println("canPack is " + canPack + " and expected value is " + false);
        canPack = flourPackTest.canPack(0, 0, -1, 0);
        System.out.println("canPack is " + canPack + " and expected value is " + false);
        canPack = flourPackTest.canPack(0, 0, 0, -1);
        System.out.println("canPack is " + canPack + " and expected value is " + false);
        canPack = flourPackTest.canPack(0, 0, 0, 0);
        System.out.println("canPack is " + canPack + " and expected value is " + true);
        canPack = flourPackTest.canPack(4, 0, 0, 20);
        System.out.println("canPack is " + canPack + " and expected value is " + true);
        canPack = flourPackTest.canPack(4, 0, 0, 22);
        System.out.println("canPack is " + canPack + " and expected value is " + false);
        canPack = flourPackTest.canPack(4, 0, 0, 18);
        System.out.println("canPack is " + canPack + " and expected value is " + false);
        canPack = flourPackTest.canPack(0, 2, 0, 6);
        System.out.println("canPack is " + canPack + " and expected value is " + true);
        canPack = flourPackTest.canPack(0, 2, 0, 7);
        System.out.println("canPack is " + canPack + " and expected value is " + false);
        canPack = flourPackTest.canPack(0, 2, 0, 5);
        System.out.println("canPack is " + canPack + " and expected value is " + false);
        canPack = flourPackTest.canPack(0, 0, 4, 8);
        System.out.println("canPack is " + canPack + " and expected value is " + true);
        canPack = flourPackTest.canPack(0, 0, 4, 9);
        System.out.println("canPack is " + canPack + " and expected value is " + false);
        canPack = flourPackTest.canPack(0, 0, 4, 7);
        System.out.println("canPack is " + canPack + " and expected value is " + false);
        canPack = flourPackTest.canPack(1, 1, 1, 10);
        System.out.println("canPack is " + canPack + " and expected value is " + true);
    }
}
