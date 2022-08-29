package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog d = new Dog("Pomerian");
        d.setName("Tommy");
        Dog d2 = new Dog("Dalmecian");
        d2.setName("Timmy");
        d.printBreed();
        d2.printBreed();
        System.out.println(d.getName());
        System.out.println(d2.getName());
    }
}
