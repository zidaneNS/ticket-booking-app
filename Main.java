import java.util.ArrayList;
import java.util.Scanner;

import controllers.Admin;
import src.Movies;
import src.RTicket;
import src.Ticket;
import src.VIPTicket;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Movies> movies = new ArrayList<>();
    private static ArrayList<Ticket> tickets = new ArrayList<>();
    private static Admin admin = new Admin();

    public static void main(String[] args) {
        boolean isOn = true;

        while (isOn) {
            showMainMenu();
            int dev = getUserChoice();

            switch (dev) {
                case 1:
                    handleAdminMenu();
                    break;
                case 2:
                    handleUserMenu();
                    break;
                default:
                    isOn = false;
                    System.out.println("Exiting the system. Goodbye!");
                    break;
            }
        }

        scanner.close();
    }

    private static void showMainMenu() {
        System.out.println("\nOptions : ");
        System.out.println("1. Admins");
        System.out.println("2. Users");
        System.out.println("3. Exit");
        System.out.print("Who are you logging in as? ");
    }

    private static int getUserChoice() {
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            scanner.next(); // Clear the invalid input
        }
        return scanner.nextInt();
    }

    private static void handleAdminMenu() {
        scanner.nextLine(); // Clear buffer
        System.out.print("Input movie name: ");
        String movieName = scanner.nextLine();

        System.out.print("Input show time: ");
        String movieTime = scanner.nextLine();

        movies.add(admin.addMovies(movieName, movieTime));
        System.out.println("Movie added successfully.");
    }

    private static void handleUserMenu() {
        if (movies.isEmpty()) {
            System.out.println("No movies available. Please check back later.");
            return;
        }

        System.out.println("Movie lists: ");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println((i + 1) + ". " + movies.get(i).toString());
        }

        int n = -1;
        while (n < 0 || n >= movies.size()) {
            System.out.print("Choose your movie: ");
            n = getUserChoice() - 1;

            if (n < 0 || n >= movies.size()) {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("Available Ticket Types:");
        System.out.println("1. Regular Ticket (Seats available: " + RTicket.getRegularSeatsAvailable() + ")");
        System.out.println("2. VIP Ticket (Seats available: " + VIPTicket.getVipSeatsAvailable() + ")");
        System.out.print("Choose ticket type: ");
        int ticketType = getUserChoice();

        try {
            Ticket ticket;
            if (ticketType == 1) {
                ticket = new RTicket(movies.get(n).getName(), movies.get(n).getTime(), tickets.size() + 1);
            } else if (ticketType == 2) {
                ticket = new VIPTicket(movies.get(n).getName(), movies.get(n).getTime(), tickets.size() + 1);
            } else {
                System.out.println("Invalid ticket type. Please try again.");
                return;
            }

            tickets.add(ticket);
            System.out.println("Your ticket is: ");
            System.out.println(ticket.toString());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
