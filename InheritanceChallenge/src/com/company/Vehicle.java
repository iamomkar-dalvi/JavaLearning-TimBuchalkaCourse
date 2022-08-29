package com.company;

public class Vehicle {
    private int body;
    private int wheels;
    private String name;

    public Vehicle(int body,int wheels,String name){
        this.body = body;
        this.wheels=wheels;
        this.name=name;
    }
    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
