import java.util.ArrayList;

public class Daggers {
    ArrayList<Dagger> daggers;

    public Daggers(){
        daggers = new ArrayList<>();
    }

    public void takeDagger(Dagger dagger_){
        if(daggers.size() <10){
            daggers.add(dagger_);
        } else{
            System.out.println("Dagger slots are full.");
        }
    }
}
