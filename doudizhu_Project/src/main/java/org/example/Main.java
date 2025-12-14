package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        Collections.addAll(arr1,"A","2","3","4","5","6","7","8","9","10","J","Q","K");
        ArrayList<String> arr2 = new ArrayList<>(arr1);
        ArrayList<String> arr3 = new ArrayList<>(arr1);
        ArrayList<String> arr4 = new ArrayList<>(arr1);
        ArrayList<String> back = new ArrayList<>();
        back.addAll(arr1);
        arr1.clear();
        back.addAll(arr2);
        arr2.clear();
        back.addAll(arr3);
        arr3.clear();
        back.addAll(arr4);
        arr4.clear();
        back.add("minjoker");
        back.add("maxjoker");
        Collections.shuffle(back);

    }
}
