package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.172));
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour > 0)
        {
            long miles = Math.round(kilometersPerHour /1.609);
            return miles;
        }
        return -1;
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour<0){
            System.out.println("Invalid Value");
        }
        else{
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour+" km/h = "+milesPerHour+"mi/h");
        }

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0)
        {
            System.out.println("Invalid Value");
        }
        else{
            int megaByte = kiloBytes/1024;
            int kilo = kiloBytes%1024;
            System.out.println(kiloBytes+" KB = "+megaByte+" MB and "+kilo+" KB");
        }

    }
    public static boolean shouldWakeUp(boolean barking,int hourOfDay){
        if(hourOfDay > 23 || hourOfDay < 0)
        {
            return  false;
        }
        else if(barking && (hourOfDay <8 || hourOfDay > 22))
        {
            return true;
        }
        return  false;
    }

    public  static boolean isLeapYear(int year){
        if(year < 1 || year > 9999)
        {
            return false;
        }
        else if (year % 4 ==0 && year%100 != 0){
           return  true;
        }
        else if(year % 4 ==0 && year%100 ==0 && year%400==0){
            return  true;
        }
        return  false;
    }
    public static boolean areEqualByThreeDecimalPlaces(double first,double second){
        int firstInt = (int)(first*1000);
        int secondInt = (int)(second*1000);
        if(firstInt == secondInt){
            return  true;
        }
        return false;
    }

    public static boolean hasEqualSum(int first,int second, int third){
        if((first+second)==(third))
            return true;
        return false;
    }
    public static boolean hasTeen(int first,int second,int third){
        if(isTeen(first)||isTeen(second)||isTeen(third))
        {
            return true;
        }
        return false;
    }

    public static  boolean isTeen(int age){
        if(age >=13 && age<=19){
            return  true;
        }
        return false;
    }
}
