package com.lv.manager;

public class coker extends people{
    private int mamasalary;

    @Override
    public void work(){
        System.out.println("mamag others");
    }
    public coker(){
        super();
    }
    public coker(int number,String name,double salary,int mamasalary){
        super(number,name,salary);
        this.mamasalary = mamasalary;
    }
}
