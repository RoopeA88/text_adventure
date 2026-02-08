import java.util.Scanner;

public class Character {
    Scanner scanner = new Scanner(System.in);
    private String name;
    
    private CharacterType characterType;
    private static Character instance;
    private double hp;
    private double poisonDefence;
    private double fireDefence;
    private double iceDefence;
    private double earthDefence;
    private double airDefence;
    
    private double strength;
    private double intelligence;
    private double vitality;
    private double accuracy;
    private double mining;
    private double fishing;
    private double thieving;
    private double smithing;
    private double crafting;
    private double potionCrafting;
    private double cooking;

    public Inventory inventory;

    
    
    
    

    
    private Character(Inventory inventory_){
            inventory = inventory_;
    }

    public static Character getInstance(Inventory inventory){
        if(instance == null){
            instance = new Character(inventory);
        }
        return instance;
    }

    public void chooseCharacterClass(){
        boolean loop = true;
        while(loop){

            System.out.println("Choose a character class: Mage (1), Barbarian (2), Soldier (3), Thief (4), Necromancer (5)");
            int chosenClass = scanner.nextInt();

            switch (chosenClass){
                case 1:
                    characterType = CharacterType.MAGE;
                    System.out.println("You character is a mage.");
                    break;

                case 2:
                    characterType = CharacterType.BARBARIAN;
                    System.out.println("Your character is a barbarian.");
                    break;

                case 3:
                    characterType = CharacterType.SOLDIER;
                    System.out.println("Your character is a soldier.");
                    break;

                case 4:
                    characterType = CharacterType.THIEF;
                    System.out.println("Your character is a thief.");
                    break;

                case 5:
                    characterType = CharacterType.NECROMANCER;
                    System.out.println("Your character is a necromancer.");
                    break;

                default:
                    System.out.println("Invalid input");

            }
            loop = false;
        }
    }

    public void chooseName(){
        System.out.println("Choose a name for your character: ");
        String chooseName = scanner.nextLine();
        this.name = chooseName;
    }

    public String getCharacterClass(){
        return characterType.getCharacterType();
    }

    public String getName(){
        return this.name;
    }
    public double getMining(){
        return Math.round(this.mining * 100.0) / 100.0;
    }
    public double getSmithing(){
        return Math.round(this.smithing * 100.0) / 100.0;
    }
    public double getFishing(){
        return Math.round(this.fishing * 100.0) / 100.0;
    }
    public double getCooking(){
        return Math.round(this.cooking * 100.0) / 100.0;
    }
    public double getCrafting(){
        return Math.round(this.crafting * 100.0) / 100.0;
    }
    public double getThieving(){
        return Math.round(this.thieving * 100.0) / 100.0;
    }
    public double getPotionCrafting(){
        return Math.round(this.potionCrafting * 100.0) / 100.0;
    }
    public double getHp(){
        return this.hp;
    }
    public double getStrength(){
        return this.strength;
    }
    public double getVitality(){
        return this.vitality;
    }
    public double getAccuracy(){
        return this.accuracy;
    }
    public double getIntelligence(){
        return this.intelligence;
    }
    public double getFireDefence(){
        return this.fireDefence;
    }
    public double getPoisonDefence(){
        return this.poisonDefence;
    }
    public double getAirDefence(){
        return this.airDefence;
    }
    public double getIceDefence(){
        return this.iceDefence;
    }
    public double getEarthDefence(){
        return this.earthDefence;
    }
    public void setName(String name_){
        this.name = name_;
    }
    public void setCharacterClass(String type){
        if(type.equals("Mage")){
            characterType = CharacterType.MAGE;
        } else if(type.equals("Barbarian")){
            characterType = CharacterType.BARBARIAN;
        } else if(type.equals("Necromancer")){
            characterType = CharacterType.NECROMANCER;
        } else if(type.equals("Thief")){
            characterType = CharacterType.THIEF;
        } else if(type.equals("Soldier")){
            characterType = CharacterType.SOLDIER;
        }
    }
    public void setHp(double hp_){
        this.hp = hp_;
    }
    public void setPoisonDefence(double poisonDefence_){
        this.poisonDefence = poisonDefence_;
    }
    public void setFireDefence(double fireDefence_){
        this.fireDefence = fireDefence_;
    }
    public void setIceDefence(double iceDefence_){
        this.iceDefence = iceDefence_;
    }
    public void setEarthDefence(double earthDefence_){
        this.earthDefence = earthDefence_;
    }
    public void setAirDefence(double airDefence_){
        this.airDefence = airDefence_;
    }
    public void setStrength(double strength_){
        this.strength = strength_;
    }
    public void setIntelligence(double intelligence_){
        this.intelligence = intelligence_;
    }
    public void setVitality(double vitality_){
        this.vitality = vitality_;
    }
    public void setAccuracy(double accuracy_){
        this.accuracy = accuracy_;    
    }
    public void setMining(double mining_){
        this.mining = mining_;
    }
    public void setSmithing(double smithing_){
        this.smithing = smithing_;
    }
    public void setFishing(double fishing_){
        this.fishing = fishing_;
    }
    public void setCooking(double cooking_){
        this.cooking = cooking_;
    }
    public void setCrafting(double crafting_){
        this.crafting = crafting_;
    }
    public void setPotionCrafting(double potionCrafting_){
        this.potionCrafting = potionCrafting_;
    }
    public void setThieving(double thieving_){
        this.thieving = thieving_;
    }
    
    public  void trainAttribute(String attribute){
        switch(attribute){
            case "mining":
                mining+=0.01;
                System.out.println("Current mining level: "+getMining());
                break;
            case "smithing":
                smithing+=0.01;
                System.out.println("Current smithing level: "+getSmithing());
                break;
            case "fishing":
                fishing+=0.01;
                System.out.println("Current fishing level: "+getFishing());
                break;
            case "cooking":
                cooking+=0.01;
                System.out.println("Current cooking level: "+getCooking());
                break;
            case "crafting":
                crafting+=0.01;
                System.out.println("Current crafting level: "+getCrafting());
                break;
            case "potion crafting":
                potionCrafting+=0.01;
                System.out.println("Current potion crafting level: "+getPotionCrafting());
                break;
            case "thieving":
                thieving+=0.01;
                System.out.println("Current thieving level: "+ getThieving());
                break;
            default:
                System.out.println("Error, incorrect attribute");
                break;
        }
    }
        public void eatFish(String fish){
        double hpFromFish = 0;
        if(fish.equals("shrimp")){
            hpFromFish = 2;
        } else if(fish.equals("herring")){
            hpFromFish = 3;
        } else if(fish.equals("rainbowfish")){
            hpFromFish = 5;
        } else if(fish.equals("bass")){
            hpFromFish = 6;
        } else if(fish.equals("lobster")){
            hpFromFish = 8;
        } else if(fish.equals("tuna")){
            hpFromFish = 10;
        } else if(fish.equals("shark")){
            hpFromFish = 15;
        } else{
            System.out.println("Error, no such fish.");
            return;
        }
        
        for(int i =0; i<inventory.foodInventory.size(); i++){
            if(inventory.foodInventory.get(i).getName().equals(fish)){
                System.out.println("You ate a "+inventory.foodInventory.get(i).getName()+ " and gained "+hpFromFish+"hp.");
                
                inventory.foodInventory.remove(i);
                this.hp+=hpFromFish;
                return;
                
            }
        }
        
        
        
    }
}
