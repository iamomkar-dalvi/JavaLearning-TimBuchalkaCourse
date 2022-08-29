package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printDayOfTheWeek(-3);
        printNumberInWord(-5);
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(2, 2020));
    }
    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a valid day");
                break;
        }
    }
    public static void printNumberInWord(int number){
        switch (number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }
    public static boolean isLeapYear(int year){
        if(year<1 || year > 9999)
        {
            return false;
        }
        if(year%4==0){
            if(year%100!=0){
                return true;
            }
            else if(year %400==0)
            {
                return  true;
            }
            return false;
        }
        return  false;
    }

    public static int getDaysInMonth(int month, int year){
        if(month < 1 || month > 12 || year < 1 || year > 9999){
            return-1;
        }
        int count = 0;
        switch (month){
            case 1:
                count = 31;
                break;
            case 2:
                count = 28;
                break;
            case 3:
                count = 31;
                break;
            case 4:
                count = 30;
                break;
            case 5:
                count = 31;
                break;
            case 6:
                count = 30;
                break;
            case 7:
                count = 31;
                break;
            case 8:
                count = 31;
                break;
            case 9:
                count = 30;
                break;
            case 10:
                count = 31;
                break;
            case 11:
                count = 30;
                break;
            case 12:
                count = 31;
                break;
        }
        if(month == 2 && isLeapYear(year)){
            count = 29;
        }
        return count;
    }
}
