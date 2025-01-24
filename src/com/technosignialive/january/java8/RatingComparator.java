package com.technosignialive.january.java8;

import java.util.Comparator;

public class RatingComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o2.getRating().compareTo(o1.getRating());
    }
}
