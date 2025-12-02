package org.example;

import java.util.Objects;

public class anyway {
    private String s;
    private  int age;

    public anyway() {
    }

    public anyway(String s, int age) {
        this.s = s;
        this.age = age;
    }

    /**
     * 获取
     * @return s
     */
    public String getS() {
        return s;
    }

    /**
     * 设置
     * @param s
     */
    public void setS(String s) {
        this.s = s;
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


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        anyway anyway = (anyway) o;
        return age == anyway.age && Objects.equals(s, anyway.s);
    }


    public String toString() {
        return "anyway{s = " + s + ", age = " + age + "}";
    }
}
