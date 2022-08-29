package com.company;

public class Car extends  Vehicle{
    private int door;
    private String model;
    private String mileage;

    public Car(String name,int door,String model,String mileage){
        super(1,4,name);
        this.door = door;
        this.model = model;
        this.mileage=mileage;
    }
    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }
}
