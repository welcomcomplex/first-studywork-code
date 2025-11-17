package com.lv.studentsimpledemo;

public class student {
    private int id;
    private String name  ;
    private int age;
    private String where;

    public student() {
    }

    public student(int id, String name, int age, String where) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.where = where;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
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
     * @return where
     */
    public String getWhere() {
        return where;
    }

    /**
     * 设置
     * @param where
     */
    public void setWhere(String where) {
        this.where = where;
    }

    public String toString() {
        return "student{id = " + id + ", name = " + name + ", age = " + age + ", where = " + where + "}";
    }
}
