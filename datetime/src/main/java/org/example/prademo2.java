package org.example;

import java.util.Scanner;

public class prademo2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        int number = Integer.parseInt(str);
        String result = "";
        while(number > 0){
            if(number % 2 == 1){
                result = "1" + result;
            }else {
                result = "0" + result;
            }
            number = number / 2;
        }
        System.out.println(result.isEmpty() ? "0" : result);
    }
}
