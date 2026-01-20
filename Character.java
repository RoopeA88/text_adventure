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
    private String position;
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
        return this.hp;
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
    public  void trainAttribute(String attribute){
        switch(attribute){
            case "mining":
                mining+=0.01;
                System.out.println("Current mining level: "+getMining());
                break;
            case "smithing":
                smithing+=0.01;
                break;
            case "fishing":
                fishing+=0.01;
                break;
            case "cooking":
                cooking+=0.01;
                break;
            case "crafting":
                crafting+=0.01;
                break;
            case "potion crafting":
                potionCrafting+=0.01;
                break;
            case "thieving":
                thieving+=0.01;
                break;
            default:
                System.out.println("Error, incorrect attribute");
                break;
        }
    }
}
