package org.example;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int age;
    private String name;
    private int score;
    private String indiate;


    public Student() {
    }

    public Student(int age, String name, int score, String indiate) {
        this.age = age;
        this.name = name;
        this.score = score;
        this.indiate = indiate;
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
     * @return score
     */
    public int getScore() {
        return score;
    }

    /**
     * 设置
     * @param score
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * 获取
     * @return indiate
     */
    public String getIndiate() {
        return indiate;
    }

    /**
     * 设置
     * @param indiate
     */
    public void setIndiate(String indiate) {
        this.indiate = indiate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && score == student.score && Objects.equals(name, student.name) && Objects.equals(indiate, student.indiate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    public String toString() {
        return "Student{age = " + age + ", name = " + name + ", score = " + score + ", indiate = " + indiate + "}";
    }

    @Override
    public int compareTo(Student o) {
        int i =0 ;
        i = this.getAge() - o.getAge();
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;
        return i;
    }
}
