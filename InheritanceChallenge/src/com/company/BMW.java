package com.company;

public class BMW extends  Car{
    private String registrationNumber;
    private int handSteering;
    private int price;
    public BMW(String name,String mileage,String registrationNumber,int handSteering,int price){
        super(name,4,"BMW","999");
        this.registrationNumber =registrationNumber;
        this.handSteering=handSteering;
        this.price = price;
    }
}
