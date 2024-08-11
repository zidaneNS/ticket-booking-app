package src;

public class Movies {
    String name;
    String time;

    public Movies(String name, String time){
        this.name = name;
        this.time = time;
    }

    public String getName() {return this.name;}
    public String getTime() {return this.time;}

    public String toString(){
        return name + " played at " + time;
    }
}
