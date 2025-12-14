package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class mapdemo1 {
    public static void main(String[] args) {
        Map<String, String> mp = new HashMap<>();
        mp.put("123","wdww");
        mp.put("126","wdww1");
        mp.put("125","wdww2");
        mp.put("124","wdww412");
        boolean right = mp.containsKey("123");
        Set<String> srr = mp.keySet();
        /*Iterator<String> it = srr.iterator();
        while(it.hasNext()){
            String s = it.next();
            String sv = mp.get(s);
            System.out.println(s + "wei" + sv);
        }*/
        /*srr.forEach( t -> {
                String sv1 = mp.get(t);
                System.out.println(t + "   " + sv1);
            }
        );*/
        /*Set<Map.Entry<String,String>> ent = mp.entrySet();
        for (Map.Entry<String, String> entry : ent) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "  " + value);
        }*/
        Set<Map.Entry<String,String>> ent = mp.entrySet();
        /*Iterator<Map.Entry<String,String>> it = ent.iterator();
        while(it.hasNext()){
            Map.Entry<String,String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "  " + value);
        }*/
        ent.forEach(entry -> {
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println(key + "  " + value);
            }
        );
        mp.forEach( (s, s2) -> System.out.println(s + s2));

    }
}
