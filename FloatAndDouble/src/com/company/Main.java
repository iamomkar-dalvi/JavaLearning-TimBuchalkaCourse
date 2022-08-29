package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("Min Float: "+minFloat);
        System.out.println("Max Float: "+maxFloat);

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("Min Double: "+minDouble);
        System.out.println("Max Double: "+maxDouble);

        int myInt = 5;
        float myFloat = 5.5f;
        double myDouble = 5.5;

        double pound = 7;
        double kilo = 0.453*pound;
        System.out.println("Kilo Conversion: "+kilo);
    }
}
