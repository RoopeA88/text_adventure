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

    private int shrimp = 0;
    private int herring = 0;
    private int rainbowfish = 0;
    private int bass = 0;
    private int lobster = 0;
    private int tuna = 0;
    private int shark = 0;

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
    public ArrayList<Food> getFoodInventory(){
        return foodInventory;
    }
    public int getFoodInventoryLength(){
        return foodInventory.size();
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
    public int getShrimp(){
        int counter = 0;
        for(int i = 0; i<foodInventory.size(); i++){
            if(foodInventory.get(i).getName().equals("shrimp")){
                counter++;
            }
        }
        return counter;
    }
    public void takeShrimp(){
        Food shrimp = new Food.FoodBuilder().name("shrimp").hp(2).build();
        foodInventory.add(shrimp);
        System.out.println("You managed to catch a shrimp");
    }
    public int getHerring(){
        int counter = 0;
        for(int i = 0; i<foodInventory.size(); i++){
            if(foodInventory.get(i).getName().equals("herring")){
                counter++;
            }
        }
        return counter;
    }
    public void takeHerring(){
        Food herring = new Food.FoodBuilder().name("herring").hp(3).build();
        foodInventory.add(herring);
        System.out.println("You managed to catch a herring.");
    }
    public int getRainbowfish(){
        int counter = 0;
        for(int i = 0; i<foodInventory.size(); i++){
            if(foodInventory.get(i).getName().equals("rainbowfish")){
                counter++;
            }
        }
        return counter;
    }
    public void takeRainbowfish(){
        Food rainbowfish = new Food.FoodBuilder().name("rainbowfish").hp(5).build();
        foodInventory.add(rainbowfish);
        System.out.println("You managed to catch a rainbowfish.");
    }
    public int getBass(){
        int counter = 0;
        for(int i = 0; i<foodInventory.size(); i++){
            if(foodInventory.get(i).getName().equals("bass")){
                counter++;
            }
        }
        return counter;
    }
    public void takeBass(){
        Food bass = new Food.FoodBuilder().name("bass").hp(6).build();
        foodInventory.add(bass);
        System.out.println("You managed to catch a bass.");
    }
    public int getLobster(){
        int counter = 0;
        for(int i = 0; i<foodInventory.size(); i++){
            if(foodInventory.get(i).getName().equals("lobster")){
                counter++;
            }
        }
        return counter;
    }
    public void takeLobster(){
        Food lobster = new Food.FoodBuilder().name("lobster").hp(8).build();
        foodInventory.add(lobster);
        System.out.println("You managed to catch a lobster.");
    }
    public int getTuna(){
        int counter = 0;
        for(int i = 0; i<foodInventory.size(); i++){
            if(foodInventory.get(i).getName().equals("tuna")){
                counter++;
            }
        }
        return counter;
    }
    public void takeTuna(){
        Food tuna = new Food.FoodBuilder().name("tuna").hp(10).build();
        foodInventory.add(tuna);
        System.out.println("You managed to catch a tuna.");
    }
    public int getShark(){
        int counter = 0;
        for(int i = 0; i<foodInventory.size(); i++){
            if(foodInventory.get(i).getName().equals("shark")){
                counter++;
            }
        }
        return counter;
    }
    public void takeShark(){
        Food shark = new Food.FoodBuilder().name("shark").hp(15).build();
        foodInventory.add(shark);
        System.out.println("You managed to catch a shark.");
    }
    

}
