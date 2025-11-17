import java.util.Scanner;

public class Character {
    Scanner scanner = new Scanner(System.in);

    private String name;

    private 

    Alliance alliance;

    CharacterType characterType;

    private static Character instance;

    String juttu;

    

    private Character(){
        
        
    }

    public static Character getInstance(){
        if(instance == null){
            instance = new Character();
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
}
