package com;

import java.util.ArrayList;
import java.util.List;

public class ListMaker {

    public List<Integer> createUniqueList(List<Integer> list) {
        List<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int valueToTest = list.get(i);
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                int valueToCompare = list.get(j);
                if (valueToTest == valueToCompare) {
                    count++;
                }
            }
            if (count == 1) {
                uniqueList.add(valueToTest);
            }
        }
        return uniqueList;
    }

    public List<Integer> createDuplicateList(List<Integer> list) {
        List<Integer> duplicateList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            int valueToTest = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                int valueToCompare = list.get(j);
                if (valueToTest == valueToCompare) {
                    count++;
                }
            }
            if (count == 2) {
                duplicateList.add(valueToTest);
            }
        }
        return duplicateList;
    }

    public List<Integer> createUniqueList(List<Integer> list1, List<Integer> list2) {
        return null;
    }
}