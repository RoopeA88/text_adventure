import java.util.ArrayList;
import java.util.ArrayList;
public class Inventory {
    
    ArrayList<Sword> swordInventory = new ArrayList<>();
    ArrayList<Shield> shieldInventory = new ArrayList<>();
    ArrayList<Dagger> daggerInventory = new ArrayList<>();
    ArrayList<Axe> axeInventory = new ArrayList<>();
    ArrayList<Wand> wandInventory = new ArrayList<>();

    ArrayList<LegArmor> legArmorInventory = new ArrayList<>();
    ArrayList<BodyArmor> bodyArmorInventory = new ArrayList<>();
    ArrayList<HeadGear> headGearInventory = new ArrayList<>();
    ArrayList<ArmGear> armGearInvetory = new ArrayList<>(); 

    ArrayList<Amulet> amuletInventory = new ArrayList<>();
    ArrayList<Ring> ringInventory = new ArrayList<>();

    ArrayList<Potion> potionInventory = new ArrayList<>();
    ArrayList<Food> foodInventory = new ArrayList<>();

    Crafting craftingInvetory;

    public Inventory(){

    }

    public void takeSword(Sword sword_){
        if(swordInventory.size() >=5){
            System.out.println("Can't pick up the sword, sword slots are full");
        } else{
        System.out.println("You picked up a sword: "+sword_.getName()+".");
        swordInventory.add(sword_);
        }
    }

}
