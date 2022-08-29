package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i = 0;
        int sum =0;
        Scanner sc = new Scanner(System.in);
        boolean hasNextInt = false;
        while(i<10){
            System.out.println("Enter number"+i+"# : ");
            hasNextInt = sc.hasNextInt();
            if(hasNextInt){
                sum += sc.nextInt();
                i++;
            }
            else{
                System.out.println("Invalid number");
            }
            sc.nextLine(); //Handle end of line enter key
        }
        System.out.println("Sum of "+i+" number is = "+sum);
        sc.close();
    }
}
