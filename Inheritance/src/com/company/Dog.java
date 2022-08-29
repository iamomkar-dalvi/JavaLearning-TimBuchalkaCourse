package com.company;

public class Dog extends Animal{
    private int eyes;
    private int tail;
    private int legs;
    private String sound;

    public Dog(String name,int size ,int weight,int eyes,int tail,int legs,String sound){
        super(name,1,2,size,weight);
        this.eyes=eyes;
        this.tail=tail;
        this.legs=legs;
        this.sound=sound;
    }
    @Override
    public void eat(){
        System.out.println("Dog is eating");
        super.eat();
    }
    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
