package com.company;

public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int fins;
    public Fish(String name,int size,int weight,int gills,int eyes,int fins){
        super(name,1,1,size,weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins=fins;
    }
    public void swim(){
        System.out.println("Fish swims");
        sleep();
    }
//    @Override
//    public void sleep(){
//        System.out.println("Fish is sleeping");
//        super.sleep();
//    }

}
