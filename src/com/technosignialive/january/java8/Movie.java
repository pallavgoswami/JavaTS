package com.technosignialive.january.java8;

public class Movie implements Comparable<Movie> {
    String name;
    Long releaseDate;
    Double rating;
    Double totalEarning;

    public Movie(String name, Long releaseDate, Double rating, Double totalEarning) {
        super();
        this.name = name;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.totalEarning = totalEarning;
    }

    public String getName() {
        return name;
    }

    public Long getReleaseDate() {
        return releaseDate;
    }

    public Double getRating() {
        return rating;
    }

    public Double getTotalEarning() {
        return totalEarning;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(Long releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void setTotalEarning(Double totalEarning) {
        this.totalEarning = totalEarning;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", releaseDate=" + releaseDate +
                ", rating=" + rating +
                ", totalEarning=" + totalEarning +
                '}';
    }

    @Override
    public int compareTo(Movie o) {
        // Sort movies by rating in descending order.
        if (o.getReleaseDate() > this.getReleaseDate()) {
            return 1;
        } else if (o.getReleaseDate() < this.getReleaseDate()) {
            return -1;
        } else {
            return 0;
        }
    }
}
