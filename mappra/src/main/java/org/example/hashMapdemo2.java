package org.example;

import java.util.HashMap;

public class hashMapdemo2 {
    public static void main(String[] args) {
        Student st1 = new Student(13,"wcwq",70,"wqdqccc");
        Student st2 = new Student(14,"wcwq2",80,"wqdqccc2");
        Student st3 = new Student(15,"wcwq3",90,"wqdqccc3");
        Student st4 = new Student(16,"wcwq4",100,"wqdqccc4");
        HashMap<Student,String> hsp1 = new HashMap<>();
        hsp1.put(st1,st1.getIndiate());
        hsp1.put(st2,st2.getIndiate());
        hsp1.put(st3,st3.getIndiate());
        hsp1.put(st4,st4.getIndiate());
        int count = 0;
        for (HashMap.Entry<Student, String> entry : hsp1.entrySet()) {
            Student s1 = entry.getKey();
            count += s1.getScore();
        }

    }
}
