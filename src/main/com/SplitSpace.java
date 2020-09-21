package com;

import java.util.ArrayList;

public class SplitSpace {


    public static void main(String[] args) {
        SplitSpace splitSpace = new SplitSpace();
        splitSpace.removeSpace();
    }

    public void removeSpace(){
        String name = "Pri ya";
        String noSpaceString = name.replaceAll("\\s", "");
        System.out.println(noSpaceString);
    }

    public void listCreation(){
        ArrayList<Integer> list1= new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);


        ArrayList<Integer> list3 = new ArrayList<Integer>();




    }

}
