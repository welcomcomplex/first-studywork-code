package com.lv.duixiangdemo1;

import org.w3c.dom.ls.LSOutput;

public class peoflus {
    public static  void main(String[] args) {


        int[] arr = {1, 23, 4, 56, 7};
        String text = ArrayUtil.printArr(arr);
        float[] brr = {1, 241, 5, 16, 72, 7};
        float pj = ArrayUtil.getAerage(brr);
        System.out.println(text);

    }
}
