package org.example;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<haskdog>  brr = new ArrayList<>();
        haskdog bg1 = new haskdog();
        brr.add(bg1);
        keep(brr);
    }
    public static void keep(ArrayList<? extends dog> arr){
        for (dog dog : arr) {
            dog.eat();
        }

    }
}
