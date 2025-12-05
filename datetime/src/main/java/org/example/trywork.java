package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class trywork {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(sum < 200){
            String numstr = sc.nextLine();
            int j = Integer.parseInt(numstr);
            arr.add(j);
            sum += j;
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
