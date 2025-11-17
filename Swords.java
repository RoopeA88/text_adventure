import java.util.ArrayList;

public class Swords {
    ArrayList<Sword> swords;

    public Swords(){
        swords = new ArrayList<>();
    }

    public void takeSword(Sword sword){
        if(swords.size() <10){
        swords.add(sword);
        } else{
            System.out.println("Sword slots are full.");
        }
    }
}
