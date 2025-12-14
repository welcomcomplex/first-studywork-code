package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class mapalldemo5 {
    public static void main(String[] args) {

    }
    public static void check(int... b){
        ArrayList<Integer> arr = new ArrayList<>();

        Collections.addAll(arr,1,2,3,4,17,18,19,20);
        Collections.shuffle(arr);
        Collections.swap(arr,1,4);

    }
}
