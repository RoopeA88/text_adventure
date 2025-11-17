import java.util.ArrayList;

public class Axes {
    
    ArrayList Axes;

    public Axes(){
        Axes = new ArrayList<>();
    }

    public void takeAxe(Axe axe_){
        if(Axes.size() <10){
            Axes.add(axe_);
        } else{
            System.out.println("Axe slots are full.");
        }
    }
}
