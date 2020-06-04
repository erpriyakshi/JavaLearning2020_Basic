package com.priyakshi.controlstatement.challenge.paintjob;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PaintJob paintJob = new PaintJob();
        double width = 0;
        double height = 0;
        double areaPerBucket = 0;
        int extraBucket = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Width");
        boolean isNextDoubleWidth = scanner.hasNextDouble();
        if (isNextDoubleWidth) {
            width = scanner.nextDouble();
        }
        scanner.nextLine();
        System.out.println("Enter height");
        boolean isNextDoubleheight = scanner.hasNextDouble();
        if (isNextDoubleheight) {
            height = scanner.nextDouble();
        }
        scanner.nextLine();
        System.out.println("Enter ArePerbucket");
        boolean isNextDoubleArePerbucket = scanner.hasNextDouble();
        if (isNextDoubleArePerbucket) {
            areaPerBucket = scanner.nextDouble();
        }
        scanner.nextLine();
        System.out.println("Enter ExtraBucket");
        boolean isNextInt = scanner.hasNextInt();
        if (isNextInt) {
            extraBucket = scanner.nextInt();
        }
        scanner.nextLine();
        int bucketCount = paintJob.getBucketCount(width, height, areaPerBucket, extraBucket);
        if(bucketCount>=0) {
            System.out.println("Bob needs to purchase bucket from market " + bucketCount);
        }
    }

}


