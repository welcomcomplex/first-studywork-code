package org.example;

public  abstract class animal {
    private int age;
    private String name;

    public animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public abstract void eat();
    public animal(){}

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
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

    public String toString() {
        return "animal{age = " + age + ", name = " + name + "}";
    }
}
