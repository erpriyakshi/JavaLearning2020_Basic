package com.priyakshi.controlstatement.challenge.paintjob;

public class PaintJob {

    public int getBucketCount(double width, double height, double areaPerBucket, int extraBucket) {
        if (width > 0 && height > 0 && areaPerBucket > 0 && extraBucket >= 0) {
            double area = width * height;
            int numberOfBuckets = (int) Math.ceil(area / areaPerBucket);
            int requiredBucket = numberOfBuckets - extraBucket;
            return requiredBucket;
        } else {
            System.out.println("Invalid value");
            return -1;
        }
    }
}
