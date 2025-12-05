package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class colldemo1 {
    public static void main(String[] args) {


    Collection<student> str = new ArrayList<student>();
    student s1 = new student();
    student s2 = new student();
    student s3 = new student();
    str.add(s1);
    str.add(s2);
    str.add(s3);
    boolean tr = str.contains(s1);
    Iterator<student> it = str.iterator();
    while(it.hasNext()){
        student ss1 = it.next();
        System.out.println(ss1.getName());

    }
    for(student s : str){

    }
    str.forEach(student->
            System.out.println(student)

    );

    }
}
