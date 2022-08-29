package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    int finalScore_1= calculateScore(true,90,5,10);
    System.out.println("Your Final Score is :"+finalScore_1);
    int finalScore_2= calculateScore(true,40,5,10);
    System.out.println("Your Final Score is :"+finalScore_2);
    }
    public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){
        if(gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return -1;
    }
}
