package com;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(3);
        list1.add(1);
        list1.add(5);
        ListMaker listMaker = new ListMaker();
        ArrayList<Integer> uniqueList = listMaker.createUniqueList(list1);
        System.out.println("unique list is " + uniqueList);
        ArrayList<Integer> duplicateList = listMaker.createDuplicateList(list1);
        System.out.println("Duplicate list is " + duplicateList);
    }
}
