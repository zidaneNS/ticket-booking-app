import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfMovies;
        String movieName;
        String movieTime;

        ArrayList<Movies> movies = new ArrayList<>();
        System.out.println("Input # of movies : ");
        numOfMovies = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i<numOfMovies; i++){
            System.out.println("input title : ");
            movieName = scanner.nextLine();
            System.out.println("input movie time : ");
            movieTime = scanner.nextLine();

            movies.add(new Movies(movieName, movieTime));
        }
        
        for(Movies x:movies){
            System.out.println(x.toString());
        }

        RTicket rTicket = new RTicket(movies.get(0).name,movies.get(0).time);

        System.out.println(rTicket.toString());
        scanner.close();
    }
}