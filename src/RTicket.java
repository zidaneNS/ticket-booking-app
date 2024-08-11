package src;

public class RTicket extends Ticket {
    private double seatPrice = 40000;
    private int id;
    private static int regularSeatsAvailable = 10; // Maximum 10 regular seats

    public RTicket(String title, String time, int id) {
        super(title, time);
        if (regularSeatsAvailable > 0) {
            regularSeatsAvailable--;
        } else {
            throw new RuntimeException("Regular Tickets are sold out.");
        }
        this.id = id;
    }

    @Override
    public String toString() {
        return "Regular Ticket:\nID: " + id + "\nTitle: " + getTitle() + "\nShowTime: " + getTime() + "\nPrice: " + seatPrice;
    }

    public static int getRegularSeatsAvailable() {
        return regularSeatsAvailable;
    }
}
