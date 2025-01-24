package com.technosignialive.november.collection_framework;

import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "Alabama";
        str = str.toLowerCase();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] input = str.toCharArray();
        for (char c : input) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }
}
