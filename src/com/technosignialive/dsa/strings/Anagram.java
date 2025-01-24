package com.technosignialive.dsa.strings;

import java.util.HashMap;

// Given two strings s and t, return true if it s an anagram of s, and false otherwise
public class Anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        if (checkAnagram(s, t)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }

    public static boolean checkAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            //map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }
        return true;
    }
}
