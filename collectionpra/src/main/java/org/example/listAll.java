package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class listAll {
    Object[] obj = new Object[20];
    int size;

    public <T> boolean addall(T t){
        obj[size] = t;
        size++;
        return  true;
    }
    public <T> T get(int i){
        return (T)obj[i];
    }
    public static<T> void addAll(ArrayList<T> arr, T...t){
        for (T t1 : arr) {
            arr.add(t1);
        }
    }

    @Override
    public  String toString() {
        return Arrays.toString(obj);
    }
}
