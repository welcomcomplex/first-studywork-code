package org.example;

import java.util.Arrays;

public class myArrayList<T> {
    int size;
    Object[] obj = new Object[10];
    public boolean add(T t){
        obj[size] = t;
        size++;
        return  true;

    }
    public T get(int i){
        T t1 = (T)obj[i];
        return t1;
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
