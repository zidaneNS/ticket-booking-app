package src;
public class Ticket {
    private String movieTitle;
    private String showTime;
    private int amount;

    public Ticket(String title, String time, int amount){
        this.movieTitle = title;
        this.showTime = time;
        this.amount = amount;
    }

    public String getTitle(){
        return this.movieTitle;
    }

    public String getTime(){
        return this.showTime;
    }

    public int getAmount(){
        return this.amount;
    }

    public String toString(){
        return movieTitle + "\n" + showTime ;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public void getTicket(){
        if(this.amount > 0){
            this.amount--;
        } else {
            throw new RuntimeException("Tickets are sold out.");
        }
    }
}
