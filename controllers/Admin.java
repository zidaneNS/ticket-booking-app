package controllers;

import java.util.ArrayList;
import java.util.Scanner;

import src.Movies;
import src.RTicket;
import src.Ticket;
import src.VIPTicket;

public class Admin {
    static Scanner scanner = new Scanner(System.in);

    public Movies addMovies(String name, String time) {
        return new Movies(name, time);
    }

    public void handleAdminMenu(ArrayList<Movies> movies, ArrayList<Ticket> tickets) {
        
        System.out.print("Input movie name: ");
        String movieName = scanner.nextLine();
        
        System.out.print("Input show time: ");
        String movieTime = scanner.nextLine();
        
        System.out.print("Input number of Regular seats: ");
        int regSeats = scanner.nextInt();
        
        System.out.print("Input number of VIP seats: ");
        int vipSeats = scanner.nextInt();
        scanner.nextLine(); // Clear buffer after using scanner.nextInt() in previous options

        // Setting movies
        Movies newMovie = this.addMovies(movieName, movieTime);
        movies.add(newMovie);

        // Setting tickets
        tickets.add(new RTicket(movieName, movieTime, regSeats));
        tickets.add(new VIPTicket(movieName, movieTime, vipSeats));

        System.out.println("Movie added successfully.");
    }
}
