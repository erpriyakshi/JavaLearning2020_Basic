package com.priyakshi.controlstatement.challenge.flourpackproblem;

public class Main {
    public static void main(String[] args) {
        FlourPack flourPack = new FlourPack();
        boolean canPack = flourPack.canPack(1, 2, 6);
        System.out.println(canPack);

    }
}
