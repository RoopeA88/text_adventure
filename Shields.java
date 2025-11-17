import java.util.ArrayList;

public class Shields {
    
    ArrayList<Shield> shield;

    public Shields(){
        shield = new ArrayList<>();
    }

    public void takeShield(Shield shield_){
        if(shield.size() <10){
            shield.add(shield_);
        }
    }
}
