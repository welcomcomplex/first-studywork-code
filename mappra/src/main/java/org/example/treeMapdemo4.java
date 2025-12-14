package org.example;

import java.util.Comparator;
import java.util.TreeMap;

public class treeMapdemo4 {
    public static void main(String[] args) {
        String str = "aaabbbcccdddee";
        int temp = 0;
        TreeMap<Character,Integer> count = new TreeMap<>((o1,  o2) -> o1 - o2);
        for (int i = 0; i < str.length(); i++) {

            if(count.containsKey(str.charAt(i))){
                temp = count.get(str.charAt(i));
                temp++;
                count.put(str.charAt(i), temp);
            }else{
                count.put(str.charAt(i), 1);
            }

            }
        System.out.println(count);
        }
    }

