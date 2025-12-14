package org.example;

import java.util.*;

public class Pokergame {
    static ArrayList<Integer> box = new ArrayList<>();

    static HashMap<Integer,String> pokerbox = new HashMap<>();
    static {
        String[] color = {"♥","♠","♦","♣"};
        String[] number= {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
        int temp = 0;

        for (String nb : number) {
            for (String cr : color) {
                temp++;
                pokerbox.put(temp,cr+nb);
                box.add(temp);
            }
        }
        temp++;
        pokerbox.put(temp,"minjoker");
        box.add(temp);
        temp++;
        pokerbox.put(temp,"maxjoker");
        box.add(temp);
    }
    public Pokergame(){
        //洗牌
        Collections.shuffle(box);
        //发牌
        TreeSet<Integer> lood = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        for (int i = 0; i < box.size(); i++) {
            if(i <= 2){
                lood.add(box.get(i));
                continue;
            }
            if(i % 3 == 0){
                player1.add(box.get(i));
            }
            if(i % 3 == 1){
                player2.add(box.get(i));
            }
            if(i % 3 == 2){
                player3.add(box.get(i));
            }
        }
        lookpoker("底牌",lood);
        lookpoker("player1",player1);
        lookpoker("player2",player2);
        lookpoker("player3",player3);
    }
    public void lookpoker(String name,TreeSet<Integer> list){
        System.out.println(name + ":");
        for (Integer i : list) {
            System.out.println(pokerbox.get(i) + " ");
        }
        System.out.println();
    }

}
