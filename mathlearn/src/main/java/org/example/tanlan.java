package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tanlan {
    public static void main(String[] args) {
        String s = "次哦你问瓦片v闹四都怕残破v哦那四v哦闹i礼品那草嫔娘娘查看abbbbbbbbbbbbbbbbbbb" +
                "wiocnociowjowjc";
        String regex = "ab+";
        StringBuilder str1 = new StringBuilder();
        Pattern r1 = Pattern.compile(regex);
        Matcher ma = r1.matcher(s);
        while (ma.find()){
            str1.append("[");
            str1.append(ma.group());
            str1.append("]");

        }
        String s2 = "我要学学学学编编编编程程";
        String regx = "(.)\\1+";
        String re = s2.replaceAll(regx,"$1");
        System.out.println(re);
    }
}
