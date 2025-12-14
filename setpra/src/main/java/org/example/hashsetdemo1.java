package org.example;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetdemo1 {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("aaa");
        set1.add("bbbb");
        set1.add("cccc");
        set1.add("ddd");
        /*Iterator<String> it = set1.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }*/
       /* for (String s : set1) {
            System.out.println(s);
        }*/
        set1.forEach(s -> System.out.println(s));
    }
}
