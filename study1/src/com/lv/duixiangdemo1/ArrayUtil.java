package com.lv.duixiangdemo1;

public class ArrayUtil {

    public  static  String printArr(int[] arr){
        String tempst = "[";
        for (int i = 0; i < arr.length-1; i++) {
            tempst = tempst + arr[i] + ",";
        }
        tempst = tempst +  arr[arr.length-1] + "]";
        return tempst;
    }
    public static float getAerage(float[] arr){
        float sum = 0;
        float result = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        result = sum / arr.length;
        return result;

    }

}
