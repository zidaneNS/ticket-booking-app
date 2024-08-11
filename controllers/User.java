package controllers;

import java.util.ArrayList;

import src.Movies;
import src.Ticket;

public class User {

    public void handleUserMenu(ArrayList<Movies> movies, ArrayList<Ticket> tickets) {
        // Check if movies are available
        if (movies.isEmpty()) {
            System.out.println("No movies available. Please check back later.");
            return;
        }

        // Displaying movie lists
        System.out.println("Movie lists: ");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println((i + 1) + ". " + movies.get(i).toString());
        }

        // Choose movie
        int n = -1;
        while (n < 0 || n >= movies.size()) {
            System.out.print("Choose your movie: ");
            n = OptionMain.getUserChoice() - 1;

            if (n < 0 || n >= movies.size()) {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        // Ticket category
        System.out.println("\nAvailable Ticket Types:");
        System.out.println("1. Regular Ticket available : " + tickets.get(2*n).getAmount());
        System.out.println("2. VIP Ticket : " + tickets.get(2*n + 1).getAmount());
        System.out.print("Choose ticket type: ");
        int ticketType = OptionMain.getUserChoice();

        try {
            Ticket selectedTicket = null;
            if (ticketType == 1) {
                selectedTicket = tickets.get(2 * n);
            } else if (ticketType == 2) {
                selectedTicket = tickets.get(2 * n + 1);
            } else {
                System.out.println("Invalid input!");
                return;
            }

            // Simulate ticket purchase
            selectedTicket.getTicket();

            System.out.println("\nYour ticket is: ");
            System.out.println(selectedTicket.toString());

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
