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
        Potion minorFire = new Potion.PotionBuilder().name("minor fire resistance potion").hp(0).mp(0).poison(0).earth(0).fire(5).ice(0).air(0).build();
        potionInventory.add(minorFire);
    }
    public int getFirePotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("fire resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeFirePotion(){
        System.out.println("You received a fire resistance potion.");
        Potion firePotion = new Potion.PotionBuilder().name("fire resistance potion").hp(0).mp(0).poison(0).earth(0).fire(15).ice(0).air(0).build();
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
    public void takeGreaterFirePotion(){
        System.out.println("You received a greater fire resistance potion.");
        Potion greaterFire = new Potion.PotionBuilder().name("greater fire resistance potion").hp(0).mp(0).poison(0).earth(0).fire(30).ice(0).air(0).build();
        potionInventory.add(greaterFire);
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
    public void takeMinorPoisonPotion(){
        System.out.println("You received a minor poison resistance potion.");
        Potion minorPoison = new Potion.PotionBuilder().name("minor poison resistance potion").hp(0).mp(0).poison(5).earth(0).fire(0).ice(0).air(0).build();
        potionInventory.add(minorPoison);
    }
    public int getPoisonPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("poison resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takePoisonPotion(){
        System.out.println("You received a poison resistance potion.");
        Potion poisonPotion = new Potion.PotionBuilder().name("poison resistance potion").hp(0).mp(0).poison(15).earth(0).fire(0).ice(0).air(0).build();
        potionInventory.add(poisonPotion);
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
        Potion greaterPoison = new Potion.PotionBuilder().name("greater poison resistance potion").hp(0).mp(0).poison(30).earth(0).fire(0).ice(0).air(0).build();
        potionInventory.add(greaterPoison);
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
    public void takeMinorEarthPotion(){
        System.out.println("You received a minor earth resistance potion.");
        Potion minorEarth = new Potion.PotionBuilder().name("minor earth resistance potion").hp(0).mp(0).poison(0).earth(5).fire(0).ice(0).air(0).build();
        potionInventory.add(minorEarth);
    }
    public int getEarthPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("earth resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeEarthPotion(){
        System.out.println("You received an earth resistance potion.");
        Potion earthPotion = new Potion.PotionBuilder().name("earth resistance potion").hp(0).mp(0).poison(0).earth(15).fire(0).ice(0).air(0).build();
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
        Potion greaterEarth = new Potion.PotionBuilder().name("greater earth resistance potion").hp(0).mp(0).poison(0).earth(30).fire(0).ice(0).air(0).build();
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
    public void takeMinorIcePotion(){
        System.out.println("You received a minor ice resistance potion.");
        Potion minorIce = new Potion.PotionBuilder().name("minor ice resistance potion").hp(0).mp(0).poison(0).earth(0).fire(0).ice(5).air(0).build();
        potionInventory.add(minorIce);
    }
    public int getIcePotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("ice resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeIcePotion(){
        System.out.println("You received an ice resistance potion.");
        Potion icePotion = new Potion.PotionBuilder().name("ice resistance potion").hp(0).mp(0).poison(0).earth(0).fire(0).ice(15).air(0).build();
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
        Potion greaterIce = new Potion.PotionBuilder().name("greater ice resistance potion").hp(0).mp(0).poison(0).earth(0).fire(0).ice(30).air(0).build();
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
    public int getAirPotion(){
        int counter = 0;
        for(Potion potion : potionInventory){
            if(potion.getName().equals("air resistance potion")){
                counter++;
            }
        }
        return counter;
    }
    public void takeAirPotion(){
        System.out.println("You received an air resistance potion.");
        Potion airPotion = new Potion.PotionBuilder().name("air resistance potion").hp(0).mp(0).poison(0).earth(0).fire(0).ice(0).air(15).build();
        potionInventory.add(airPotion);
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
        Potion greaterAir = new Potion.PotionBuilder().name("greater air resistance potion").hp(0).mp(0).poison(0).earth(0).fire(0).ice(0).air(30).build();
        potionInventory.add(greaterAir);
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
                name.append("potion");
                int firstSpace = name.indexOf(" ");
                int secondSpace = name.indexOf(" ", firstSpace+1);
                int thirdSpace = name.indexOf(" ", secondSpace+1);
                
                name.insert(thirdSpace+1, "and ");
                // poor elemental fire and ice potion
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