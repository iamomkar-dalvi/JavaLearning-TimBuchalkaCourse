package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        getBucketCount(2.75, 3.25, 2.5, 1);
    }
    public static void  inputThenPrintSumAndAverage(){
        int sum = 0;
        long average =0;
        int i =0;
        Scanner sc = new Scanner(System.in);
        boolean hasNextInt = false;
        while(true){
            hasNextInt = sc.hasNextInt();
            if(hasNextInt){
                sum+= sc.nextInt();
                i++;
            }
            else{
                break;
            }
        }
        if(i>0){
            average = Math.round((double)sum/i);
        }
        System.out.println("SUM = "+sum+" AVG = "+average);
        sc.close();
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width<=0 || height <=0|| areaPerBucket<= 0|| extraBuckets< 0){
            return  -1;
        }
        double wallArea = width*height;
        double areaRemaining = wallArea - (areaPerBucket*extraBuckets);
        int i = 0;
        int count = (int) Math.ceil(areaRemaining/areaPerBucket);
        //System.out.println(i);
        return  count;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width<=0 || height <=0|| areaPerBucket<= 0){
            return  -1;
        }
        double areaRemaining = width*height;
        int count = (int) Math.ceil(areaRemaining/areaPerBucket);
        //System.out.println(i);
        return  count;
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area <=0|| areaPerBucket<= 0){
            return  -1;
        }
        double areaRemaining = area;
        int count = (int) Math.ceil(areaRemaining/areaPerBucket);
        //System.out.println(i);
        return  count;
    }
}
