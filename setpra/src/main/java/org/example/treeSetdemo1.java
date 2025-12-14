package org.example;

import java.util.TreeSet;

public class treeSetdemo1 {
    public static void main(String[] args) {
        TreeSet<String> ts1 = new TreeSet<>((o1, o2) -> {
            int i = o1.length() - o2.length();
            i = i == 0 ? o1.compareTo(o2) : i;
            return i;
        });
        ts1.add("qqqq");
        ts1.add("qad");
        ts1.add("dwfwf");
        Person p1 = new Person("张三", 18, 90, 80, 70);
        Person p2 = new Person("李四", 17, 80, 70, 80);
        Person p3 = new Person("王五", 16, 70, 80, 90);
        TreeSet<Person> ts2 = new TreeSet<>();
        ts2.add(p1);
        ts2.add(p2);
        ts2.add(p3);
        System.out.println(ts2);
    }
}
