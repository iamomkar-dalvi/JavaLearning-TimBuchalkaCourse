package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        displayHighScorePosition("Omkar",calculateHighScorePosition(1500));
        displayHighScorePosition("Ajay",calculateHighScorePosition(900));
        displayHighScorePosition("Pranjal",calculateHighScorePosition(400));
        displayHighScorePosition("Abhishek",calculateHighScorePosition(50));
    }
    public static void displayHighScorePosition(String name,int position ){
        System.out.println(name+" managed to get into position: "+position);
    }
    public static int calculateHighScorePosition(int score){

        if(score > 1000)
        {
            return 1;
        }
        else if (score >500 && score < 1000)
        {
            return 2;
        }
        else if(score > 100 && score < 500){
            return 3;
        }
        return 4;
    }
}
