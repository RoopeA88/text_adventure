import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class Game {
    private GameState currentState;
    private boolean running = true;
    Inventory inventory = new Inventory();
    Character hero = Character.getInstance(inventory);
    int idCounter = 1;
    
    public Game(){
        clearScreen();
        hero.chooseName();
        System.out.println("Your name is: ");
        System.out.println(hero.getName());
        hero.chooseCharacterClass();
        System.out.println("Your class is: ");
        System.out.println(hero.getCharacterClass());

        setState(new HomeState());
        

    }

    public  void setState(GameState state){
        currentState = state;
    }
    public void run(){
        while(running){
            if(currentState != null){
                currentState.execute(this);
            } else{
                running = false;
            }
        }
    }
    public void stop(){
        running = false;
    }

    public void clearScreen(){
        for(int i = 0; i<10; i++){
            System.out.println();
        }
    }
    public void saveGame(String save){
        String jsonSave = String.format(Locale.US,
        "{\n"+
        
        "\"name\": \"%s\",\n" +
        "\"character type\": \"%s\", \n"+
        "\"hp\": %f, \n"+
        "\"poison defence\": %f, \n"+
        "\"fire defence\": %f, \n"+
        "\"ice defence\": %f, \n"+
        "\"earth defence\": %f, \n"+
        "\"air defence\": %f, \n"+
        "\"strength\": %f, \n"+
        "\"intelligence\": %f, \n"+
        "\"vitality\": %f, \n"+
        "\"accuracy\": %f, \n"+
        "\"mining\": %f, \n"+
        "\"fishing\": %f, \n"+
        "\"thieving\": %f, \n"+
        "\"smithing\": %f, \n"+
        "\"crafting\": %f, \n"+
        "\"potion crafting\": %f, \n"+
        "\"cooking\": %f\n"+
        "}",
        hero.getName(),hero.getCharacterClass(), hero.getHp(), hero.getPoisonDefence(), hero.getFireDefence(), hero.getIceDefence(), hero.getEarthDefence(),
        hero.getAirDefence(),hero.getStrength(), hero.getIntelligence(), hero.getVitality(),hero.getAccuracy(), hero.getMining(), hero.getFishing(),
        hero.getThieving(),hero.getSmithing(), hero.getCrafting(),hero.getPotionCrafting(), hero.getCooking()


    );
        try (FileWriter file = new FileWriter(save+".json")) {
        file.write(jsonSave);
        System.out.println("✅ Peli tallennettu ID:llä slottiin: "+save.charAt(save.length()-1)+".");
        
    } catch (IOException e) {
        System.err.println("❌ Tallennus epäonnistui: " + e.getMessage());
    }
    }
}
