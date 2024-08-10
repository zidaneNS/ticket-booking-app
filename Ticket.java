public class Ticket {
    private String movieTitle;
    private String showTime;

    Ticket(String title, String time){
        this.movieTitle = title;
        this.showTime = time;
    }

    public String getTitle(){
        return this.movieTitle;
    }

    public String getTime(){
        return this.showTime;
    }

    public String toString(){
        return movieTitle + "\n" + showTime ;
    }
}
