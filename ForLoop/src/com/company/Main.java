package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println("10,000 at 2% interest = "+calculateInterest(10000,2));
//        for (int i = 10 ; i>0;i--){
//            System.out.println("10000 at "+i+"% interest = "+calculateInterest(10000,i));
//        }

        for(int n = 1;n<=50;n++){
            System.out.println("Number "+n+" isPrime = "+isPrime(n));
        }
    }
    public static double calculateInterest(double primaryAmount, double interest){
        return  (primaryAmount*(interest/100));
    }
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i<= (long)Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
