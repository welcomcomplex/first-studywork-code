package org.example;

public class lihuacat extends cat{
    public lihuacat(){}
    public lihuacat(int age,String name){
        super(age,name);
    }
    @Override
    public void eat() {
        System.out.println("狸花猫在吃东西");
    }
}
