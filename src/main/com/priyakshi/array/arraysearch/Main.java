package com.priyakshi.array.arraysearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SearchNumberInArray searchNumberInArray = new SearchNumberInArray();
        Scanner scanner = new Scanner(System.in);
        int intArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println("Enter Any Number");
        boolean isHasNext = scanner.hasNext();
        if (isHasNext) {
            int number = scanner.nextInt();
            boolean searchNumber = searchNumberInArray.searchNumber(intArray, number);
            if (searchNumber){
                System.out.println(number + " number present in Array");
            }else{
                System.out.println("number is not found in array");
            }

        }
    }
}
