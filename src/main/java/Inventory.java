import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


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
    ArrayList<Ore> oreInventory = new ArrayList<>();

    private double goldCurrency;
    Scanner scanner = new Scanner(System.in);

    

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
        int counter = 0;
        for(Ore ore: oreInventory){
            if(ore.getName().equals("iron ore")){
                counter++;
            }
        }
        return counter;
    }
    public void takeIronOre(){
        System.out.println("You managed to mine some iron ore.");

        Ore ironOre = new Ore.OreBuilder().name("iron ore").build();
        oreInventory.add(ironOre);
    }
    
    public int getCoal(){
        int counter = 0;
        for(Ore coal: oreInventory){
            if(coal.getName().equals("coal")){
                counter++;
            }
        }
        return counter;
    }
    public void takeCoal(){
        System.out.println("You managed to mine some coal.");

        Ore coal = new Ore.OreBuilder().name("coal").build();
        oreInventory.add(coal);
    }
    public int getSilver(){
        int counter = 0;
        for(Ore ore : oreInventory){
            if(ore.getName().equals("silver")){
                counter++;
            }
        }
        return counter;
    }
    public void takeSilver(){
        System.out.println("You managed to mine some silver.");
        Ore silver = new Ore.OreBuilder().name("silver").build();
        oreInventory.add(silver);
    }
    public int getGold(){
        int counter = 0;
        for(Ore ore : oreInventory){
            if(ore.getName().equals("gold")){
                counter++;
            }
        }
        return counter;
    }
    public void takeGold(){
        System.out.println("You managed to mine some gold.");
        Ore gold = new Ore.OreBuilder().name("gold").build();
    }
    public int getMithril(){
        int counter = 0;
        for(Ore ore : oreInventory){
            if(ore.getName().equals("mithril")){
                counter++;
            }
        }
        return counter;
    }
    public void takeMithril(){
        System.out.println("You managed to mine some mithril.");
        Ore mithril = new Ore.OreBuilder().name("mithril").build();
        oreInventory.add(mithril);
    }
    public int getAdamantite(){
        int counter = 0;
        for(Ore ore : oreInventory){
            if(ore.getName().equals("adamantite")){
                counter++;
            }
        }
        return counter;
    }
    public void takeAdamantite(){
        System.out.println("You managed to mine some adamantite.");
        Ore adamantite = new Ore.OreBuilder().name("adamantite").build();
        oreInventory.add(adamantite);
    }
    public int getRunite(){
        int count = 0;
        for(Ore ore: oreInventory){
            if(ore.getName().equals("runite")){
                count++;
            }
        }
        return count;
    }
    public void takeRunite(){
        System.out.println("You managed to mine some runite.");
        Ore runite = new Ore.OreBuilder().name("runite").build();
        oreInventory.add(runite);
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
        Food herring = new Food.FoodBuilder().name("herring").hp(5).build();
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
        Food rainbowfish = new Food.FoodBuilder().name("rainbowfish").hp(7).build();
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
        Food bass = new Food.FoodBuilder().name("bass").hp(10).build();
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
        Food lobster = new Food.FoodBuilder().name("lobster").hp(13).build();
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
        Food tuna = new Food.FoodBuilder().name("tuna").hp(16).build();
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
        Food shark = new Food.FoodBuilder().name("shark").hp(20).build();
        foodInventory.add(shark);
        System.out.println("You managed to catch a shark.");
    }
    public double getGoldCurrency(){
        return this.goldCurrency;
    }
    public void takeGoldCurrency(double sum){
        goldCurrency+=sum;
    }
    public int getMinorHpPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("minor hp potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeMinorHpPotion(){
        System.out.println("You received a minor hp potion.");
        Potion minorHp = new Potion.PotionBuilder().name("minor hp potion").hp(10).mp(0).poison(0).earth(0).fire(0).ice(0).air(0).build();
        potionInventory.add(minorHp);
    }
    public int getHpPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("hp potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeHpPotion(){
        System.out.println("You received an hp potion.");
        Potion hpPotion = new Potion.PotionBuilder().name("hp potion").hp(30).mp(0).poison(0).earth(0).fire(0).ice(0).air(0).build();
        potionInventory.add(hpPotion);
    }
    public int getGreaterHpPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("greater hp potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeGreaterHpPotion(){
        System.out.println("You received a greater hp potion.");
        Potion greaterHp = new Potion.PotionBuilder().name("greater hp potion").hp(70).mp(0).poison(0).earth(0).fire(0).ice(0).air(0).build();
        potionInventory.add(greaterHp);
    }
    public int getMinorMpPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("minor mp potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeMinorMpPotion(){
        System.out.println("You received a minor mp potion.");
        Potion minorMp = new Potion.PotionBuilder().name("minor mp potion").hp(0).mp(10).poison(0).earth(0).fire(0).ice(0).air(0).build();
        potionInventory.add(minorMp);
    }
    public int getMpPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("mp potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeMpPotion(){
        System.out.println("You received an mp potion.");
        Potion mpPotion = new Potion.PotionBuilder().name("mp potion").hp(0).mp(30).poison(0).earth(0).fire(0).ice(0).air(0).build();
        potionInventory.add(mpPotion);
    }
    public int getGreaterMpPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("greater mp potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeGreaterMpPotion(){
        System.out.println("You received a greater mp potion.");
        Potion greaterMp = new Potion.PotionBuilder().name("greater mp potion").hp(0).mp(70).poison(0).earth(0).fire(0).ice(0).air(0).build();
        potionInventory.add(greaterMp);
    }
    
    public int getMinorFirePotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("minor fire resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeMinorFirePotion(){
        System.out.println("You received a minor fire resistance potion.");
        Potion lesserFire = new Potion.PotionBuilder().name("minor fire resistance potion").hp(0).mp(0).poison(0).earth(0).fire(5).ice(0).air(0).build();
        potionInventory.add(lesserFire);
    }
    public int getLesserFirePotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("lesser fire resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeLesserFirePotion(){
        System.out.println("You received a lesser fire resistance potion.");
        Potion lesserFire = new Potion.PotionBuilder().name("lesser fire resistance potion").hp(0).mp(0).poison(0).earth(0).fire(11).ice(0).air(0).build();
        potionInventory.add(lesserFire);
    }
    public int getCommonFirePotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("common fire resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeCommonFirePotion(){
        System.out.println("You received a common fire resistance potion.");
        Potion commonFire = new Potion.PotionBuilder().name("common fire resistance potion").hp(0).mp(0).poison(0).earth(0).fire(18).ice(0).air(0).build();
        potionInventory.add(commonFire);
    }
    public int getImprovedFirePotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("improved fire resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeImprovedFirePotion(){
        System.out.println("You received an improved fire resistance potion.");
        Potion improvedFire = new Potion.PotionBuilder().name("improved fire resistance potion").hp(0).mp(0).poison(0).earth(0).fire(25).ice(0).air(0).build();
        potionInventory.add(improvedFire);
    }
    public int getMajorFirePotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("major fire resistance potion")){
                counter++;
            }
        }
        return counter;
    }

    public void takeMajorFirePotion(){
        System.out.println("You received a major fire resistance potion.");
        Potion firePotion = new Potion.PotionBuilder().name("major fire resistance potion").hp(0).mp(0).poison(0).earth(0).fire(31).ice(0).air(0).build();
        potionInventory.add(firePotion);
    }
    public int getGreaterFirePotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("greater fire resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public int getSuperiorFirePotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("superior fire resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeSuperiorFirePotion(){
        System.out.println("You received a superior fire resistance potion.");
        Potion greaterFire = new Potion.PotionBuilder().name("superior fire resistance potion").hp(0).mp(0).poison(0).earth(0).fire(38).ice(0).air(0).build();
        potionInventory.add(greaterFire);
    }
    public void takeGreaterFirePotion(){
        System.out.println("You received a greater fire resistance potion.");
        Potion greaterFire = new Potion.PotionBuilder().name("greater fire resistance potion").hp(0).mp(0).poison(0).earth(0).fire(45).ice(0).air(0).build();
        potionInventory.add(greaterFire);
    }
    public void takeMinorPoisonPotion(){
        System.out.println("You received a minor poison resistance potion.");
        Potion minorPoison = new Potion.PotionBuilder().name("minor poison resistance potion").hp(0).mp(0).poison(5).earth(0).fire(0).ice(0).air(0).build();
        potionInventory.add(minorPoison);
    }
    public int getMinorPoisonPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("minor poison resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeLesserPoisonPotion(){
        System.out.println("You received a lesser poison resistance potion.");
        Potion lesserPoison = new Potion.PotionBuilder().name("lesser poison resistance potion").hp(0).mp(0).poison(11).earth(0).fire(0).ice(0).air(0).build();
        potionInventory.add(lesserPoison);
    }
    public int getLesserPoisonPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("lesser poison resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeCommonPoisonPotion(){
        System.out.println("You received a common poison resistance potion.");
        Potion commonPoison = new Potion.PotionBuilder().name("common poison resistance potion").hp(0).mp(0).poison(18).earth(0).fire(0).ice(0).air(0).build();
        potionInventory.add(commonPoison);
    }
    public int getCommonPoisonPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("common poison resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeImprovedPoisonPotion(){
        System.out.println("You received an improved poison resistance potion.");
        Potion improvedPoison = new Potion.PotionBuilder().name("improved poison resistance potion").hp(0).mp(0).poison(25).earth(0).fire(0).ice(0).air(0).build();
        potionInventory.add(improvedPoison);
    }
    public int getImprovedPoisonPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("improved poison resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public int getMajorPoisonPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("major poison resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeMajorPoisonPotion(){
        System.out.println("You received a major poison resistance potion.");
        Potion poisonPotion = new Potion.PotionBuilder().name("major poison resistance potion").hp(0).mp(0).poison(31).earth(0).fire(0).ice(0).air(0).build();
        potionInventory.add(poisonPotion);
    }
    public void takeSuperiorPoisonPotion(){
        System.out.println("You received a superior poison resistance potion.");
        Potion superiorPoison = new Potion.PotionBuilder().name("superior poison resistance potion").hp(0).mp(0).poison(38).earth(0).fire(0).ice(0).air(0).build();
        potionInventory.add(superiorPoison);
    }
    public int getSuperiorPoisonPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("superior poison resistance potion")){
                counter++;
            }
        }
        return counter;

    }
    public int getGreaterPoisonPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("greater poison resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    
    public void takeGreaterPoisonPotion(){
        System.out.println("You received a greater poison resistance potion.");
        Potion greaterPoison = new Potion.PotionBuilder().name("greater poison resistance potion").hp(0).mp(0).poison(45).earth(0).fire(0).ice(0).air(0).build();
        potionInventory.add(greaterPoison);
    }
    public void takeMinorEarthPotion(){
        System.out.println("You received a minor earth resistance potion.");
        Potion commonEarth = new Potion.PotionBuilder().name("minor earth resistance potion").hp(0).mp(0).poison(0).earth(5).fire(0).ice(0).air(0).build();
        potionInventory.add(commonEarth);
    }
    public int getMinorEarthPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("minor earth resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeLesserEarthPotion(){
        System.out.println("You received a lesser earth resistance potion.");
        Potion commonEarth = new Potion.PotionBuilder().name("lesser earth resistance potion").hp(0).mp(0).poison(0).earth(11).fire(0).ice(0).air(0).build();
        potionInventory.add(commonEarth);
    }
    public int getLesserEarthPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("lesser earth resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeCommonEarthPotion(){
        System.out.println("You received a common earth resistance potion.");
        Potion commonEarth = new Potion.PotionBuilder().name("common earth resistance potion").hp(0).mp(0).poison(0).earth(18).fire(0).ice(0).air(0).build();
        potionInventory.add(commonEarth);
    }
    public int getCommonEarthPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("common earth resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeImprovedEarthPotion(){
        System.out.println("You received an improved earth resistance potion.");
        Potion improvedEarth = new Potion.PotionBuilder().name("improved earth resistance potion").hp(0).mp(0).poison(0).earth(25).fire(0).ice(0).air(0).build();
        potionInventory.add(improvedEarth);
    }
    public int getImprovedEarthPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("improved earth resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public int getMajorEarthPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("major earth resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeMajorEarthPotion(){
        System.out.println("You received a major earth resistance potion.");
        Potion majorEarth = new Potion.PotionBuilder().name("major earth resistance potion").hp(0).mp(0).poison(0).earth(31).fire(0).ice(0).air(0).build();
        potionInventory.add(majorEarth);
    }
    public int getSuperiorEarthPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("superior earth resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeSuperiorEarthPotion(){
        System.out.println("You received a superior earth resistance potion.");
        Potion earthPotion = new Potion.PotionBuilder().name("superior earth resistance potion").hp(0).mp(0).poison(0).earth(38).fire(0).ice(0).air(0).build();
        potionInventory.add(earthPotion);
    }
    public int getGreaterEarthPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("greater earth resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeGreaterEarthPotion(){
        System.out.println("You received a greater earth resistance potion.");
        Potion greaterEarth = new Potion.PotionBuilder().name("greater earth resistance potion").hp(0).mp(0).poison(0).earth(45).fire(0).ice(0).air(0).build();
        potionInventory.add(greaterEarth);
    }
    public void takeMinorIcePotion(){
        System.out.println("You received a minor ice resistance potion.");
        Potion greaterEarth = new Potion.PotionBuilder().name("minor ice resistance potion").hp(0).mp(0).poison(0).earth(0).fire(0).ice(5).air(0).build();
        potionInventory.add(greaterEarth);
    }
    public int getMinorIcePotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("minor ice resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public int getLesserIcePotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("lesser ice resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeLesserIcePotion(){
        System.out.println("You received a lesser ice resistance potion.");
        Potion greaterEarth = new Potion.PotionBuilder().name("lesser ice resistance potion").hp(0).mp(0).poison(0).earth(0).fire(0).ice(11).air(0).build();
        potionInventory.add(greaterEarth);
    }
    public int getCommonIcePotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("common ice resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeCommonIcePotion(){
        System.out.println("You received a common ice resistance potion.");
        Potion commonIce = new Potion.PotionBuilder().name("common ice resistance potion").hp(0).mp(0).poison(0).earth(0).fire(0).ice(18).air(0).build();
        potionInventory.add(commonIce);
    }
    public int getImprovedIcePotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("improved ice resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeImprovedIcePotion(){
        System.out.println("You received an improved ice resistance potion.");
        Potion improvedIce = new Potion.PotionBuilder().name("improved ice resistance potion").hp(0).mp(0).poison(0).earth(0).fire(0).ice(25).air(0).build();
        potionInventory.add(improvedIce);
    }
    
    public int getMajorIcePotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("major ice resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeMajorIcePotion(){
        System.out.println("You received a major ice resistance potion.");
        Potion majorIce = new Potion.PotionBuilder().name("major ice resistance potion").hp(0).mp(0).poison(0).earth(0).fire(0).ice(31).air(0).build();
        potionInventory.add(majorIce);
    }

    public int getSuperiorIcePotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("superior ice resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeSuperiorIcePotion(){
        System.out.println("You received a superior ice resistance potion.");
        Potion icePotion = new Potion.PotionBuilder().name("superior ice resistance potion").hp(0).mp(0).poison(0).earth(0).fire(0).ice(38).air(0).build();
        potionInventory.add(icePotion);
    }
    public int getGreaterIcePotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("greater ice resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeGreaterIcePotion(){
        System.out.println("You received a greater ice resistance potion.");
        Potion greaterIce = new Potion.PotionBuilder().name("greater ice resistance potion").hp(0).mp(0).poison(0).earth(0).fire(0).ice(45).air(0).build();
        potionInventory.add(greaterIce);
    }
    public int getMinorAirPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("minor air resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeMinorAirPotion(){
        System.out.println("You received a minor air resistance potion.");
        Potion minorAir = new Potion.PotionBuilder().name("minor air resistance potion").hp(0).mp(0).poison(0).earth(0).fire(0).ice(0).air(5).build();
        potionInventory.add(minorAir);
    }
    
    public int getLesserAirPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("lesser air resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeLesserAirPotion(){
        System.out.println("You received a lesser air resistance potion.");
        Potion lesserAir = new Potion.PotionBuilder().name("lesser air resistance potion").hp(0).mp(0).poison(0).earth(0).fire(0).ice(0).air(11).build();
        potionInventory.add(lesserAir);
    }
    public int getCommonAirPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("common air resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeCommonAirPotion(){
        System.out.println("You received a common air resistance potion.");
        Potion commonAir = new Potion.PotionBuilder().name("common air resistance potion").hp(0).mp(0).poison(0).earth(0).fire(0).ice(0).air(18).build();
        potionInventory.add(commonAir);
    }
    public int getImprovedAirPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("improved air resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeImprovedAirPotion(){
        System.out.println("You received an improved air resistance potion.");
        Potion improvedAir = new Potion.PotionBuilder().name("improved air resistance potion").hp(0).mp(0).poison(0).earth(0).fire(0).ice(0).air(25).build();
        potionInventory.add(improvedAir);
    }
    public int getMajorAirPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("major air resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeMajorAirPotion(){
        System.out.println("You received a major air resistance potion.");
        Potion majorAir = new Potion.PotionBuilder().name("major air resistance potion").hp(0).mp(0).poison(0).earth(0).fire(0).ice(0).air(31).build();
        potionInventory.add(majorAir);
    }
    public int getSuperiorAirPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("superior air resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeSuperiorAirPotion(){
        System.out.println("You received a superior air resistance potion.");
        Potion superiorAir = new Potion.PotionBuilder().name("superior air resistance potion").hp(0).mp(0).poison(0).earth(0).fire(0).ice(0).air(38).build();
        potionInventory.add(superiorAir);
    }
    public int getGreaterAirPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("greater air resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeGreaterAirPotion(){
        System.out.println("You received a greater air resistance potion.");
        Potion greaterAir = new Potion.PotionBuilder().name("greater air resistance potion").hp(0).mp(0).poison(0).earth(0).fire(0).ice(0).air(45).build();
        potionInventory.add(greaterAir);
    }
    public String takeRandomMinorLevelTwoElementPotion(){
        
        StringBuilder name = new StringBuilder();
        
        List<Integer> elements = List.of(5,5,0,0,0);
        int fire;
        int ice;
        int air;
        int earth;
        int poison;
        while(true){
            
            fire = elements.get((int)(Math.random() * 5));
            ice = elements.get((int)(Math.random() * 5));
            air = elements.get((int)(Math.random() * 5));
            earth = elements.get((int)(Math.random() * 5));
            poison = elements.get((int)(Math.random() * 5));
            if(fire + ice + air + earth + poison == 10){
                if(fire == 5){
                    name.append("fire ");
                } if(ice == 5){
                    name.append("ice ");
                } if(air == 5){
                    name.append("air ");
                } if(earth == 5){
                    name.append("earth ");
                } if(poison == 5){
                    name.append("poison ");
                }
                break;
            }
        }

        name.append("resistance potion");
        int firstSpace = name.indexOf(" ");
        name.insert(firstSpace+1, "and ");
        // fire and ice potion
        Potion potion = new Potion.PotionBuilder().name(name.toString()).hp(0).mp(0).poison(poison).earth(earth).fire(fire).ice(ice).air(air).quality("minor").level(2).build();
        potionInventory.add(potion);
        return potion.toString();

    }
    public String takeRandomLevelThreeMinorPotion(){
        List<Integer> list = List.of(5,5,5,0,0);

        int air;
        int fire;
        int earth;
        int ice;
        int poison;

        while(true){

        }
    }
    
    public void takeRandomLevelOneRing(String element){
        Ring poorRing = null;
        if(element.equals("air")){
            poorRing = new Ring.RingBuilder().name("poor elemental "+element+" ring").level(1).iceDefence(0).fireDefence(0).earthDefence(0).poisonDefence(0).airDefence(5).quality("poor").build();
        }
        else if(element.equals("ice")){
            poorRing = new Ring.RingBuilder().name("poor elemental "+element+" ring").level(1).iceDefence(5).fireDefence(0).earthDefence(0).poisonDefence(0).airDefence(0).quality("poor").build();

        }  else if(element.equals("poison")){
            poorRing = new Ring.RingBuilder().name("poor elemental "+element+" ring").level(1).iceDefence(0).fireDefence(0).earthDefence(0).poisonDefence(5).airDefence(0).quality("poor").build();

        } else if(element.equals("earth")){
            poorRing = new Ring.RingBuilder().name("poor elemental "+element+" ring").level(1).iceDefence(0).fireDefence(0).earthDefence(5).poisonDefence(0).airDefence(0).quality("poor").build();

        } else if(element.equals("fire")){
            poorRing = new Ring.RingBuilder().name("poor elemental "+element+" ring").level(1).iceDefence(0).fireDefence(5).earthDefence(0).poisonDefence(0).airDefence(0).quality("poor").build();

        }
        
        if(ringInventory.size() >=10){
            System.out.println("You found "+poorRing.getName()+" but your inventory is full.");
            System.out.println("Delete a ring to pick it up.");
            removeRing();
            if(ringInventory.size() <10){
                ringInventory.add(poorRing);
                System.out.println("You picked up "+poorRing.getName());
            } else{
                System.out.println("You didn't take the ring");
            }
        }
    }

    public String takeRandomLevelOneRingTwoElements(List<Integer> numbers){
        StringBuilder name = new StringBuilder();
        String firstPartOfName = "poor elemental ";
        name.append(firstPartOfName);
        Ring poorRing = null;
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;

        while(true){
            number1 = numbers.get((int)(Math.random() * 5));
            number2 = numbers.get((int)(Math.random() * 5));
            number3 = numbers.get((int)(Math.random() * 5));
            number4 = numbers.get((int)(Math.random() * 5));
            number5 = numbers.get((int)(Math.random() * 5));
            if(number1+number2+number3+number4+number5 == 10){
                if(number1 == 5){
                    name.append("ice ");
                } if(number2 == 5){
                    name.append("fire ");
                } if(number3 == 5){
                    name.append("earth ");
                } if(number4 == 5){
                    name.append("poison ");
                } if(number5 == 5){
                    name.append("air ");
                }
                name.append("ring");
                int firstSpace = name.indexOf(" ");
                int secondSpace = name.indexOf(" ", firstSpace+1);
                int thirdSpace = name.indexOf(" ", secondSpace+1);
                
                name.insert(thirdSpace+1, "and ");
                // poor elemental fire and ice ring
                break;
            }
        }
        poorRing = new Ring.RingBuilder().name(name.toString()).level(1).iceDefence(number1).fireDefence(number2).earthDefence(number3).poisonDefence(number4).airDefence(number5).quality("poor").build();

        
        if(ringInventory.size() >=10){
            System.out.println("You found "+poorRing.getName()+" but your inventory is full.");
            System.out.println("Delete a ring to pick it up.");
            removeRing();
            if(ringInventory.size() <10){
                ringInventory.add(poorRing);
                System.out.println("You picked up "+poorRing.getName());
            } else{
                System.out.println("You didn't take the ring");
            }
        }
        return poorRing.getName() + " "+poorRing.getLevel()+" "+poorRing.getIceDefence()+" "+ poorRing.getFireDefence()+" "+ poorRing.getEarthDefence()+" "+poorRing.getPoisonDefence()+" "+poorRing.getAirDefence()+" "+ poorRing.getQuality();
    }
    
    public void removeRing(){
        int index = 0;
        while(true){
            
            System.out.println("Press 1 to show the ring inventory. Press 2 to exit.");
            int selection = scanner.nextInt();
            scanner.nextLine();
            switch(selection){
                case 1:
                    index = 0;
                    for(Ring ring:ringInventory){
                        System.out.println(ring.toString()+ " index: "+index );
                        index++;
                    }
                    System.out.println("If you want to delete ring, press it's index number. type -1 to quit");
                    int delete = scanner.nextInt();
                    scanner.nextLine();
                    if(delete >=0 && delete <ringInventory.size()){

                        String ringName = ringInventory.get(delete).getName();
                        ringInventory.remove(delete);
                        System.out.println(ringName+" removed successfully from inventory");
                        
                        break;
                        
                    } else if(delete == -1){
                        break;
                    } else{
                        System.out.println("invalid index number.");
                        break;
                    }
                    
                    
            
                case 2: 
                    return;

                default:
                    System.out.println("Choose between 1 or 2!");
                    break;


            }
        }
    }
    

}