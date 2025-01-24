package com.technosignialive.dsa.strings;

import java.util.Arrays;

public class WordsCount {
    public static void main(String[] args) {
        String str = "          Welcome           to India, India is my country, India is great, I love India       ";
        str = str.trim(); // removes leading and trailing spaces
        String[] words = str.split("[\\s,]+");
        System.out.println(Arrays.toString(words));
        System.out.println("Word count: " + words.length);
    }
}

// int count = 0;
// for (int i = 0; i < str.length; i++) {
//      if (charAt(i) == ' ' && charAt(i - 1) != ' ') {
//          count++;
//      }
//      System.out.println(count);
//      }
// }
