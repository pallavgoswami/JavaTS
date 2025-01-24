package com.technosignialive.september.week_4.oops.encapsulation;

public class MovieMain {
    public static void main(String[] args) {
        MovieDatabaseSystem m1 = new MovieDatabaseSystem();
        MovieDatabaseSystem m2 = new MovieDatabaseSystem();
        MovieDatabaseSystem m3 = new MovieDatabaseSystem();


        m1.setMovieName("Breaking Bad");
        m1.setDirectorName("Vince Gilligan");
        m1.setGenre("Crime, Thriller");
        m1.setDuration(62.0); // Total duration of all episodes in hours
        m1.setRating(4.9f);
        m1.setReleaseYear(2008);
        m1.isClassic();


        m2.setMovieName("Chernobyl");
        m2.setDirectorName("Johan Renck");
        m2.setGenre("Drama, History");
        m2.setDuration(5.5); // Total duration of all episodes in hours
        m2.setRating(4.8f);
        m2.setReleaseYear(2019);



        m3.setMovieName("Game of Thrones");
        m3.setDirectorName("David Benioff, D.B. Weiss");
        m3.setGenre("Fantasy, Drama");
        m3.setDuration(73.0); // Total duration of all episodes in hours
        m3.setRating(4.7f);
        m3.setReleaseYear(2011);


        System.out.println("Movie 1: " + m1.getMovieName());
        System.out.println("Director: " + m1.getDirectorName());
        System.out.println("Genre: " + m1.getGenre());
        System.out.println("Duration: " + m1.getDuration() + " hours");
        System.out.println("Rating: " + m1.getRating());
        System.out.println("Release Year: " + m1.getReleaseYear());

        System.out.println("\nMovie 2: " + m2.getMovieName());
        System.out.println("Director: " + m2.getDirectorName());
        System.out.println("Genre: " + m2.getGenre());
        System.out.println("Duration: " + m2.getDuration() + " hours");
        System.out.println("Rating: " + m2.getRating());
        System.out.println("Release Year: " + m2.getReleaseYear());

        System.out.println("\nMovie 3: " + m3.getMovieName());
        System.out.println("Director: " + m3.getDirectorName());
        System.out.println("Genre: " + m3.getGenre());
        System.out.println("Duration: " + m3.getDuration() + " hours");
        System.out.println("Rating: " + m3.getRating());
        System.out.println("Release Year: " + m3.getReleaseYear());
    }
}
