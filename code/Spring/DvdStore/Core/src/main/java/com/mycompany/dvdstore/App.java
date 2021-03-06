package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.repository.FileMovieRepository;
import com.mycompany.dvdstore.service.DefaultMovieService;

public class App {
    public static void main(String[] args) {
        FileMovieRepository movieRepository = new FileMovieRepository();
        DefaultMovieService movieService = new DefaultMovieService();

        // Injection du repository dans le service
        movieService.setMovieRepository(movieRepository);

        MovieController movieController = new MovieController();

        // Injection du service dans la controller
        movieController.setMovieService(movieService);

        movieController.addUsingConsole();
    }
}
