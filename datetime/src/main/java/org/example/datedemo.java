package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class datedemo {
    public static void main(String[] args) throws ParseException {
        String str = "2000-11-11";
        SimpleDateFormat adp = new SimpleDateFormat("yyyy-MM-dd");
        Date dada = adp.parse(str);
        SimpleDateFormat adp1 = new SimpleDateFormat("yyyy年MM月dd日");
        String result = adp1.format(dada);
        System.out.println(result);
    }

    private static void methord() {
        Date da1 = new Date();
        SimpleDateFormat adf = new SimpleDateFormat("yyyy年MM月dd日  HH时mm分ss秒 星期Text");
        String da = adf.format(da1);
        System.out.println(da);
    }
}
