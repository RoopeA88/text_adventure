import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
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


public void saveGame(String file) {
    try {
        
        JSONObject json = new JSONObject();
        
        
        
        json.put("name", hero.getName());
        json.put("character type", hero.getCharacterClass());
        json.put("hp", hero.getHp());
        json.put("poison defence", hero.getPoisonDefence());
        json.put("fire defence", hero.getFireDefence());
        json.put("ice defence", hero.getIceDefence());
        json.put("earth defence", hero.getEarthDefence());
        json.put("air defence", hero.getAirDefence());
        json.put("strength", hero.getStrength());
        json.put("intelligence", hero.getIntelligence());
        json.put("vitality", hero.getVitality());
        json.put("accuracy", hero.getAccuracy());
        json.put("mining", hero.getMining());
        json.put("fishing", hero.getFishing());
        json.put("thieving", hero.getThieving());
        json.put("smithing", hero.getSmithing());
        json.put("crafting", hero.getCrafting());
        json.put("potion crafting", hero.getPotionCrafting());
        json.put("cooking", hero.getCooking());
        
        
        String jsonString = json.toString(2);
        
        if(file.equals("Save1")){
            Files.write(Paths.get(file+".json"), jsonString.getBytes());
        
            System.out.println("Game saved to slot 1");
        } else if(file.equals("Save2")){
            Files.write(Paths.get(file+".json"), jsonString.getBytes());
        
            System.out.println("Game saved to slot 2");
        } else if(file.equals("Save3")){
            Files.write(Paths.get(file+".json"), jsonString.getBytes());
        
            System.out.println("Game saved to slot 3");
        } else if(file.equals("Save4")){
            Files.write(Paths.get(file+".json"), jsonString.getBytes());
        
            System.out.println("Game saved to slot 4");
        } else if(file.equals("Save5")){
            Files.write(Paths.get(file+".json"), jsonString.getBytes());
        
            System.out.println("Game saved to slot 5");
        }

        
    } catch (Exception e) {
        System.err.println("❌ Tallennus epäonnistui: " + e.getMessage());
    }
}
    public void loadGame(String save){
        if(save.equals("Save1")){

        }
    }
}
