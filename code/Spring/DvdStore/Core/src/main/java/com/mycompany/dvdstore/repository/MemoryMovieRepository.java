package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MemoryMovieRepository implements MovieRepositoryInterface{
    private static List<Movie> movies = new ArrayList<>();

    public void add(Movie movie){
        movies.add(movie);
        System.out.println("Le film " + movie.getTitle() + " a été ajouté");
    }
}
