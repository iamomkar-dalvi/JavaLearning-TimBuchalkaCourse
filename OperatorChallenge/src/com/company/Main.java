package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double first = 20d;
        double second = 80d;
        double total = first+second*100d;
        double remain = total%40d;
        System.out.println(remain);
        boolean isRemainder = remain == 0 ? false:true;
        if(isRemainder){
            System.out.println("Got Some Remainder");
        }
    }
}
