import java.util.Random;

public class RTicket extends Ticket {
    Random random = new Random();
    int id = random.nextInt(101)+10;
    double seat = 40.000;

    RTicket(String title, String time){
        super(title, time);
    }

    public String toString(){
        return "id: " + id + "\ntitle : " + getTitle() + "\nshowTime : " + getTime() + "\nprice seat : " + seat;
    }
}
