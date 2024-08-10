public class Movies {
    String name;
    String time;

    Movies(String name, String time){
        this.name = name;
        this.time = time;
    }

    public String toString(){
        return "details : \n" + "name : " + name + "\ntime : " + time;
    }
}
