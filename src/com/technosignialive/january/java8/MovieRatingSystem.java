package com.technosignialive.january.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieRatingSystem {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        Movie m1 = new Movie("abc", 2021l, 6.7, 200000.00);
        Movie m2 = new Movie("Pushpa", 2024l, 9.8, 190000.00);
        Movie m3 = new Movie("Singham", 2022l, 6.3, 300000.00);
        Movie m4 = new Movie("Mufasa", 2025l, 10.0, 5600000.00);

        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);

        Collections.sort(list, new ReleaseDateComparator());
        Collections.sort(list, new RatingComparator());

        System.out.println(list.toString());
    }
}
