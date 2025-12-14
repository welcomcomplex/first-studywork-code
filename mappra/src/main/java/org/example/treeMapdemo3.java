package org.example;

import java.util.TreeMap;

public class treeMapdemo3 {
    public static void main(String[] args) {
        Student s1 = new Student(14, "张三", 60, "城堡");
        Student s2 = new Student(15, "张三1", 70, "城堡1");
        Student s3 = new Student(16, "张三2", 80, "城堡2");
        Student s4 = new Student(17, "张三3", 90, "城堡3");
        TreeMap<Student, String> hsp1 = new TreeMap<>();
        hsp1.put(s1, s1.getIndiate());
        hsp1.put(s2, s2.getIndiate());
        hsp1.put(s3, s3.getIndiate());
        hsp1.put(s4, s4.getIndiate());
        System.out.println(hsp1);
    }
}
