import java.io.*;
import java.util.*;



class Movie implements Comparable<Movie> {
    String movieName;
    int movieRating;

    public Movie(String name, int rating)
    {
        this.movieName = name;
        this.movieRating = rating;
    }

    public String toString()
    {
        return "Name: "+ movieName + "f, Rating: " + movieRating + " ";
    }

    @Override public int compareTo(Movie check)
    {
        return Integer.compare(this.movieRating, check.movieRating);

    }
}