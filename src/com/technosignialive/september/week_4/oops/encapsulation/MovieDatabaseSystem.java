package com.technosignialive.september.week_4.oops.encapsulation;

public class MovieDatabaseSystem {
    private String movieName;
    private String directorName;
    private String genre;
    private double duration;
    private float rating;
    private double releaseYear;

    // setters
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setDuration(double duration) {
        this.duration = duration;
    }
    public void setRating(float rating) {
        this.rating = rating;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    // getters
    public String getMovieName() {
        return this.movieName;
    }
    public String getDirectorName() {
        return this.directorName;
    }
    public String getGenre() {
        return this.genre;
    }
    public double getDuration() {
        return this.duration;
    }
    public float getRating() {
        return this.rating;
    }
    public double getReleaseYear() {
        return this.releaseYear;
    }


    public boolean isClassic() {
        return releaseYear < 2000;
    }




}

