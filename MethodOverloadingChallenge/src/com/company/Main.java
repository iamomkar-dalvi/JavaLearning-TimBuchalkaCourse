package com.company;

public class Main {

    public static final String INVALID_VALUE = "Invalid Value";
    public static void main(String[] args) {
	// write your code here
        //System.out.println(getDurationString(60,-6000));
        printYearsAndDays(561600);
    }
    public static String getDurationString(int minutes,int seconds){
        if(minutes < 0 ||(seconds<0 || seconds > 59)){
            return INVALID_VALUE;
        }
        int hours = minutes/60;
        int min = minutes%60;
        return hours+"h "+min+"m "+seconds+"s";
    }
    public static String getDurationString(int seconds){
        if(seconds<0){
            return INVALID_VALUE;
        }
        int minutes = seconds/60;
        int sec = seconds%60;
        return getDurationString(minutes,sec);
    }
    public static double area(double radius){
        if(radius<0)
            return -1;
        return (Math.PI*radius*radius);
    }
    public static double area(double x,double y){
        if(x<0 || y <0)
            return -1;
        return (x*y);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println(INVALID_VALUE);
        }
        else{
            int hours = (int)minutes/60;
            int days = hours/24;
            int years = days/365;
            days = days%365;
            System.out.println(minutes+" min ="+years+" y and "+days+" d");
        }
    }
    public static void printEqual(int one, int two, int three){
        if(one < 0 || two < 0 || three<0)
        {
            System.out.println("Invalid Value");
        }
        else if (one == two  && three==two)
        {
            System.out.println("All numbers are equal");
        }
        else if (one != two && one!= three && two != three){
            System.out.println("All numbers are different");
        }
        else{
            System.out.println("Neither all are equal or different");
        }

    }
    public static boolean isCatPlaying(boolean summer,int temperature){
        if(summer && (temperature >= 25 && temperature <=45))
        {
            return true;
        }
        else if(temperature >= 25 && temperature <=35)
        {
            return true;
        }
        return false;
    }

}
