package com.company;

import java.sql.SQLOutput;

public class Dog {
    private static String breed;
    private String name;
    public Dog(String breed){
        Dog.breed = breed;
    }
    public static void printBreed(){
        System.out.println("Breed of dog is :" + breed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
