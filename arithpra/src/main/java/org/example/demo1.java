package org.example;

import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

    }
    public  static  boolean check(ArrayList<Integer> arr,int goat){
        for (int i = 0; i < arr.size(); i++) {
            if(goat == arr.get(i)){
                return true;
            }
        }
        return false;
    }
}
