package com.technosignialive.dsa.strings;

import java.util.Arrays;

public class WordOccurrence {
    public static void main(String[] args) {
        String str = "Welcome to India, India! is my country@123 123%, @India@ is great, I love India";
        String target = "India";
        str = str.replaceAll("[^a-zA-Z\\s]", ""); // ^ -> not a-z or A-Z but leave \\s spaces
        int count = 0;
        String[] words = str.split("[ ,!@]+");
        System.out.println(Arrays.toString(words));

        for (String word : words) {
            if (word.equals(target)) {
                count++;
            }
        }
        System.out.println(count);
    }
}


// The expression [ ,]+ is a regular expression (regex) pattern used in Java (and many other programming languages) for matching specific characters in a string. Let's break it down step by step:
//
//Breakdown of [ ,]+
//Square Brackets [ ]:
//
//In regex, square brackets define a character class, which matches any one of the characters inside the brackets.
//For example, [a] matches the character 'a', [abc] matches any of 'a', 'b', or 'c'.
//Characters Inside [ ,]:
//
//Here, the character class contains two elements: a space character (' ') and a comma (',').
//So, [ ,] matches either a space or a comma.
//Plus Sign +:
//
//The + is a quantifier that matches one or more occurrences of the preceding element.
//In this case, [ ,]+ means "match one or more spaces or commas."