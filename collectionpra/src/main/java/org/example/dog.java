package org.example;

public abstract class dog extends animal {
    public dog() {}
    public dog(int age, String name){
        super(age,name);
    }
    public abstract void somethingelse();
}
