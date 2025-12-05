package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simpledataformatdemo {
    public static void main(String[] args) throws ParseException {


        String str1 = "2023-11-11 00:01:00";
        String str2 = "2023-11-11 00:11:00";

        SimpleDateFormat sdp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date da1 = sdp.parse(str1);
        Date da2 = sdp.parse(str2);
        check(da1);
        check(da2);

    }
    public static void check(Date dad) throws ParseException {
        SimpleDateFormat sdp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str3 = "2023-11-11 00:00:00";
        String str4 = "2023-11-11 00:10:00";
        Date da3 = sdp.parse(str3);
        Date da4 = sdp.parse(str4);
        long temp = dad.getTime();
        long min = da3.getTime();
        long max = da4.getTime();
        if(temp >= min && temp <= max){
            System.out.println("keyi");
        }else {
            System.out.println("no");
        }
    }
}
