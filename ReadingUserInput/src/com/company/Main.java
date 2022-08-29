package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Birth Year :");
        boolean hasnextInt = sc.hasNextInt();
        if(hasnextInt){
            int yearOfBirth = sc.nextInt();
            sc.nextLine();//Handle next line character : enter key
            System.out.println("Enter your name");
            String name = sc.nextLine();
            //System.out.println("Your name is : "+name);1964
            int age = 2022 - yearOfBirth;
            if(age>=0 && age <=100){
                System.out.println("Your name is :  "+name+" And your age is :"+age);
            }
            else{
                System.out.println("Invalid age input");
            }
        }else{
            System.out.println("Unable to parse birth year");
        }


        sc.close();
    }
}
