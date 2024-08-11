package controllers;

import src.Movies;

public class Admin {
    public Movies addMovies(String name, String time){
        return new Movies(name, time);
    }
}
