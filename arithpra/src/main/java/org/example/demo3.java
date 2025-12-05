package org.example;

import java.util.Arrays;

public class demo3 {
    public static void main(String[] args) {
        String[] arr = {"111","2222","333","4444","55555"};
    Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());
    String[] brr = arr;
        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i]);
        }
    }
}
