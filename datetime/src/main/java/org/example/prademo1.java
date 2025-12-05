package org.example;

import java.util.Scanner;

public class prademo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String regex = "\\d{1,10}";
        boolean match = str.matches(regex);
        int result = 0;
        if(match){
            // Convert string to integer using basic method without parseInt
            for (int i = 0; i < str.length(); i++) {
                int digit = str.charAt(i) - '0';  // Convert char to int
                result = result * 10 + digit;
            }
        }else {
            System.out.println("不符合规范");
        }
        System.out.println(result);
    }
}
