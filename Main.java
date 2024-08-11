import java.util.ArrayList;
import java.util.Scanner;

import controllers.Admin;
import controllers.OptionMain;
import controllers.User;
import src.Movies;
import src.Ticket;

public class Main {

    // declaring tools
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Movies> movies = new ArrayList<>();
    private static ArrayList<Ticket> tickets = new ArrayList<>();
    private static Admin admin = new Admin();
    private static User user = new User();

    // main execution
    public static void main(String[] args) {
        boolean isOn = true;

        while (isOn) {
            OptionMain.showMainMenu();
            int dev = OptionMain.getUserChoice();

            switch (dev) {
                case 1:
                    admin.handleAdminMenu(movies, tickets);
                    break;
                case 2:
                    user.handleUserMenu(movies, tickets);
                    break;
                default:
                    isOn = false;
                    System.out.println("Exiting the system. Goodbye!");
                    break;
            }
        }

        scanner.close();
    }
}
