package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //sum35Challenge();
        System.out.println(sumOdd(1, 100));
    }
    public static void sum35Challenge(){
        int total=0;
        int count = 0;
        for(int i =1;i<=1000;i++){
            if(i%3 ==0 && i%5==0){
                count++;
                System.out.println("Number that meets condition: "+i);
                total+=i;
            }
            if(count>=5){
                break;
            }
        }
        System.out.println("Condition Total: "+total);
    }

    public static boolean isOdd(int number){
        if(number<0){
            return false;
        }
        if(number%2==0){
            return false;
        }
        return true;
    }
    public static int sumOdd(int start, int end){
        if(end < start || end <0 || start <0){
            return -1;
        }
        int sum = 0;
        for(int i = start ; i<=end;i++){
            if(isOdd(i)){
                sum+=i;
            }
        }
        return sum;
    }
}
