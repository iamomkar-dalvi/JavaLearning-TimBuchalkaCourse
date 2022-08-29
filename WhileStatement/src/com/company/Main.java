package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 0;
//        while (count<=10){
//            System.out.println(count);
//            count++;
//        }
        System.out.println(sumDigits(1259));
    }
    public static boolean isEvenNumber(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }

    public static int sumDigits(int number){
        if(number< 10){
            return -1;
        }
        int sum = 0;
        int digit = 0;
        while(number > 0){
            digit = number%10;
            number= number/10;
            sum +=digit;
        }
        return sum;
    }
}
