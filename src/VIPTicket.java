package src;

public class VIPTicket extends Ticket {
    private double vipSeatPrice = 100000;

    public VIPTicket(String title, String time, int amount) {
        super(title, time, amount);
    }

    @Override
    public String toString() {
        return "VIP Ticket:\nID: " + getAmount() + "\nTitle: " + getTitle() + "\nShowTime: " + getTime() + "\nPrice: " + vipSeatPrice;
    }
}
