package com.technosignialive.dsa.strings;

// WAP to print city names from array whose length is greater than 5
// {"Latur", "Kolhapur", "Pune", "Solapur", "Nashik", "Nagpur", "Mumbai"};

public class CityNamesLength {
    public static void main(String[] args) {
        String[] str = {"Latur", "Kolhapur", "Pune", "Solapur", "Nashik", "Nagpur", "Mumbai"};
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > 5) {
                System.out.println(str[i]);
            }
        }
    }
}
