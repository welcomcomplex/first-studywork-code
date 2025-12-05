package org.example;

public class haskdog extends dog{

    public haskdog() {
    }

    public haskdog(int age, String name) {
        super(age,name);
    }

    @Override
    public void somethingelse() {
        System.out.println("蹭一蹭");
    }

    @Override
    public void eat() {
        System.out.println("哈士奇在吃骨头");

    }

    public String toString() {
        return "haskdog{}";
    }
}
