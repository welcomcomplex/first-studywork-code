package com.lv.manager;

public class people {
    private int number;
    private String name;
    private  double salary;

    public people() {
    }

    public people(int number, String name, double salary) {
        this.number = number;
        this.name = name;
        this.salary = salary;
    }

    /**
     * 获取
     * @return number
     */
    public int getNumber() {
        return number;
    }

    /**
     * 设置
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "people{number = " + number + ", name = " + name + ", salary = " + salary + "}";
    }

    public void work(){

    }
    public void eat(){
        System.out.println("eat rice");
    }


}
