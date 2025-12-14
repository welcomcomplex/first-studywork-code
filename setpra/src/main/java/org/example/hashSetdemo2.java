package org.example;

import java.util.HashSet;

public class hashSetdemo2 {
    public static void main(String[] args) {
        Student st1 = new Student(13,"wcwq");
        Student st2 = new Student(13,"wcwq");
        Student st3 = new Student(15,"wcw");
        Student st4 = new Student(14,"w12w");
        Student st5 = new Student(11,"wcwvwv");
        HashSet<Student> set1 = new HashSet<>();
        set1.add(st1);
        set1.add(st2);
        set1.add(st3);
        set1.add(st4);
        set1.add(st5);
        set1.forEach(student -> System.out.println(student.getAge()+student.getName()));
    }
}
