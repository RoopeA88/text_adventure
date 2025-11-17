import java.util.ArrayList;

public class Wands {
    
    ArrayList Wands;

    public Wands(){
        Wands = new ArrayList<>();
    }

    public void takeWand(Wand wand_){
        
        if(Wands.size() <10){
            Wands.add(wand_);
        } else{
            System.out.println("Wand slots are full.");
        }
        
    }
}
