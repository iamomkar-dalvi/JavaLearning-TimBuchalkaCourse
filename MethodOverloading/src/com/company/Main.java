package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int score = calculateScore("Omkar",100);
        System.out.println(score);
        System.out.println(calculateScore(200));
        System.out.println(calculateScore());
    }

    public static int calculateScore(String player , int score){
        System.out.println("Player "+player+" scored "+score+" runs.");
        return  score*1000;
    }
    public static int calculateScore(int score){
        System.out.println("Unnamed player scored "+score+" runs.");
        return  score*1000;
    }
    public static int calculateScore(){
        System.out.println("No player no score");
        return  0;
    }
}
