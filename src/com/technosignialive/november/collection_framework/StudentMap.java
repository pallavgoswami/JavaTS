package com.technosignialive.november.collection_framework;
// WAP to print the value of even key
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Arjun");
        map.put(2, "Acer");
        map.put(3, "Diddy");
        map.put(2, "Kanye");
//        System.out.println(map);
//        System.out.println(map.size());
//        System.out.println(map.get(3));
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() % 2 == 0) {
                System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
            }
        }
    }
}
