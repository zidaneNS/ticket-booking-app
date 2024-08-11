package src;

public class RTicket extends Ticket {
    private double seatPrice = 40000;

    public RTicket(String title, String time, int amount) {
        super(title, time, amount);
    }

    @Override
    public String toString() {
        return "Regular Ticket:\nID: " + getAmount() + "\nTitle: " + getTitle() + "\nShowTime: " + getTime() + "\nPrice: " + seatPrice;
    }
}
