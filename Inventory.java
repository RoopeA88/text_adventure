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

    private int ironOre = 0;
    private int coal = 0;
    private int silver = 0;
    private int gold = 0;
    private int mithril = 0;
    private int adamantite = 0;
    private int runite = 0;

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

    public int getIronOre(){
        return this.ironOre;
    }
    public void takeIronOre(){
        System.out.println("You managed to mine some iron ore.");

        ironOre+=1;
    }
    public int getCoal(){
        return this.coal;
    }
    public void takeCoal(){
        System.out.println("You managed to mine some coal.");

        coal+=1;
    }
    public int getSilver(){
        return this.silver;
    }
    public void takeSilver(){
        System.out.println("You managed to mine some silver.");
        silver+=1;
    }
    public int getGold(){
        return this.gold;
    }
    public void takeGold(){
        System.out.println("You managed to mine some gold.");
        gold+=1;
    }
    public int getMithril(){
        return this.mithril;
    }
    public void takeMithril(){
        System.out.println("You managed to mine some mithril.");
        mithril+=1;
    }
    public int getAdamantite(){
        return this.adamantite;
    }
    public void takeAdamantite(){
        System.out.println("You managed to mine some adamantite.");
        adamantite+=1;
    }
    public int getRunite(){
        return this.runite;
    }
    public void takeRunite(){
        System.out.println("You managed to mine some runite.");
        runite+=1;
    }

}
