package src;

public class VIPTicket extends Ticket {
    private double vipSeatPrice = 100000;
    private int id;
    private static int vipSeatsAvailable = 10; // Maximum 10 VIP seats

    public VIPTicket(String title, String time, int id) {
        super(title, time);
        if (vipSeatsAvailable > 0) {
            vipSeatsAvailable--;
        } else {
            throw new RuntimeException("VIP Tickets are sold out.");
        }
        this.id = id;
    }

    @Override
    public String toString() {
        return "VIP Ticket:\nID: " + id + "\nTitle: " + getTitle() + "\nShowTime: " + getTime() + "\nPrice: " + vipSeatPrice;
    }

    public static int getVipSeatsAvailable() {
        return vipSeatsAvailable;
    }
}
