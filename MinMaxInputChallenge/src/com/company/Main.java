package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean hasNextInt = false;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a number");
            hasNextInt = sc.hasNextInt();
            if(hasNextInt){
                int num = sc.nextInt();
                if(num < min){
                    min = num;
                }
                else if (num > max){
                    max = num;
                }
            }else{
                System.out.println("Invalid number");
                break;
            }
            sc.nextLine();
        }
        System.out.println("Max number = "+max+" Min number = "+min);
        sc.close();
    }

   
}
