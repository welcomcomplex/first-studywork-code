package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class setandmapdemo6 {
    public static void main(String[] args) {
        Student st1 = new Student(13,"wcwq",70,"wqdqccc");
        Student st2 = new Student(13,"wcwq1",80,"wqdqccc1");
        Student st3 = new Student(13,"wcwq2",90,"wqdqccc2");
        Student st4 = new Student(16,"wcwq3",100,"wqdqccc3");
        ArrayList<Student> class1 = new ArrayList<>();
        class1.add(st1);
        class1.add(st2);
        class1.add(st3);
        class1.add(st4);
        checkname(class1);

    }
    public static void checkname(ArrayList<Student> arr){
        Collections.shuffle(arr);
        int size = arr.size();
        int temp = 0;
        Random r = new Random();
        if(size > 0 && r.nextInt(size) > size*0.3){
            while(temp < size && arr.get(temp).getAge() == 13){
                temp++;
            }
            if(temp < size) {
                System.out.println(arr.get(temp).getName());
            }
        }else {
            while(temp < size && arr.get(temp).getAge() == 14){
                temp++;
            }
            if(temp < size) {
                System.out.println(arr.get(temp).getName());
            }
        }
    }
}
