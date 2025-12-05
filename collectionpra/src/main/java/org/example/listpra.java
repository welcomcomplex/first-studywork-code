package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listpra {
    public static void main(String[] args) {


        List<String> arr = new ArrayList<String>();
        arr.add("aaa");
        arr.add("bbb");
        arr.add("ccc");
        arr.add("ddd");
        Iterator<String> it = arr.iterator();
        while(it.hasNext()){
            String s = it.next();
        }
        for (String s : arr) {
            System.out.println(s);

        }
        arr.forEach(s -> System.out.println(s));

    }
}
