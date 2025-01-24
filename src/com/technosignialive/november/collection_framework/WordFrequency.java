package com.technosignialive.november.collection_framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordFrequency {

    public static void main(String[] args) {

        String str = "India is my country, I love India India is great";
        Map<String,Integer> map = new HashMap<String, Integer>();
        String[] words  = str.split("\\s");

        for(int i=0;i<words.length;i++) {
            String word = words[i];
            if(map.containsKey(word)) {
                map.put(word, map.get(word)+1); // get key karte hain to uska value milta hai
            }else {
                map.put(word,1);
            }

        }
        System.out.println(map);
    }
}
