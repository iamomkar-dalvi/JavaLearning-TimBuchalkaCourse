package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println(getLargestPrime(45));
        printSquareStar(8);
    }
    public static boolean canPack(int bigCount,int smallCount,int goal){
        if(bigCount<0 || smallCount<0 || goal<0){
            return false;
        }
        if(((bigCount*5)+smallCount)<goal){
            return false;
        }
        int count = 0;
        int rem = 0;
        while(count*5<=goal && count <= bigCount){
            rem = goal-(count*5);
            count++;
        }
        return smallCount>=rem && rem>=0;

    }
    public static int getLargestPrime(int number){
        if(number<=1){
            return -1;
        }
        int prime_factor = -1;
        for (int i = 2;i<=number;i++){
            if(number%i==0){
                boolean isprime =true;
                for(int j = 2;j<=Math.sqrt(i);j++){
                    if(i%j==0){
                        isprime=false;
                    }
                }
                if(isprime){
                    prime_factor = i;
                }
            }
        }
        return prime_factor;
    }
    public static void printSquareStar(int number){
        if(number<5){
            System.out.println("Invalid Value");
        }
        else{
            for(int i = 1;i<=number;i++){
                for (int j =1;j<=number;j++){
                    if(i==1||i==number||j==number||j==1||j==i||j==(number-i+1)){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }

                }
                System.out.println("");
            }
        }

    }

}
