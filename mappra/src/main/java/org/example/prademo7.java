package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class prademo7 {
    public static void main(String[] args) {
        Student st1 = new Student(13,"wcwq",70,"wqdqccc");
        Student st2 = new Student(13,"wcwq1",80,"wqdqccc1");
        Student st3 = new Student(13,"wcwq2",90,"wqdqccc2");
        Student st4 = new Student(16,"wcwq3",100,"wqdqccc3");
        ArrayList<Student> class1 = new ArrayList<>();
        Collections.addAll(class1,st1,st2,st3,st4);
        Collections.shuffle(class1);
        checkname(class1);
        System.out.println(class1);

    }
    public static void checkname(ArrayList<Student> arr){
        arr.remove(0);
        /*Collections.shuffle(arr);
        ArrayList<Student> brr = arr;
        if(brr.size() > 0) {

            System.out.println(brr.get(0).getName());
            brr.remove(0);

            System.out.println("是否开启下一轮点名");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            if(str == "no"){
                System.exit(0);
            }else {
                checkname(brr);
            }
        }
    }*/}
}
