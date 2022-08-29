package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int switchValue= 3;
        switch (switchValue){
            case 1:
                System.out.println("Value was One");
                break;
            case 2:
                System.out.println("Value was two");
                break;
            case 3: case 4:case 5:
                System.out.println("Value was "+switchValue);
                break;
            default:
                System.out.println("Value is not One or Two");
                break;
        }
        System.out.println("After number switch");
        CharSwitch('A');
    }

    public static void CharSwitch(char a){
        switch (a){
            case 'A':
                System.out.println("Character A was found");
                break;

            case 'B':
                System.out.println("Character B was found");
                break;
            case 'C':
                System.out.println("Character C was found");
                break;
            case 'D':
                System.out.println("Character D was found");
                break;
            default:
                System.out.println("Neither A,B,C,D were found");
                break;
        }
    }
}
