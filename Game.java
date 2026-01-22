import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import org.json.JSONObject;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class Game {
    private GameState currentState;
    private boolean running = true;
    Inventory inventory = new Inventory();
    Character hero = Character.getInstance(inventory);
    Scanner scanner = new Scanner(System.in);
    
    
    public Game(){
        clearScreen();
        while(true){

        
            System.out.println("Start a new game(1), load game(2)");
            int input = scanner.nextInt();
            if(input == 1){
                hero.chooseName();
                System.out.println("Your name is: ");
                System.out.println(hero.getName());
                hero.chooseCharacterClass();
                System.out.println("Your class is: ");
                System.out.println(hero.getCharacterClass());
                break;
            } else if(input ==2){
                System.out.println("Select a slot to load (1-5)");
                int input2 = scanner.nextInt();
                if(input2 == 1){
                    loadGame("Save1");
                    break;
                } else if(input2 == 2){
                    loadGame("Save2");
                    break;
                } else if(input2 == 3){
                    loadGame("Save3");
                    break;
                } else if(input2 == 4){
                    loadGame("Save4");
                    break;
                } else if(input2 == 5){
                    loadGame("Save5");
                    break;
                } else{
                    System.out.println("Invalid input.");
                    continue;
                }
            } else{
                System.out.println("Invalid input.");
                continue;
            }
    }
        


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
    public void loadGame(String file){
        
            try {
                byte[] data = Files.readAllBytes(Paths.get(file + ".json"));
                String jsonString = new String(data, StandardCharsets.UTF_8);
                JSONObject saveData = new JSONObject(jsonString);
                
                
                    String name = saveData.getString("name");
                    double hp = saveData.getDouble("hp");
                    String characterClass = saveData.getString("character type");
                    double airDefence = saveData.getDouble("air defence");
                    double fireDefence = saveData.getDouble("fire defence");
                    double strength = saveData.getDouble("strength");
                    double fishing = saveData.getDouble("fishing");
                    double accuracy = saveData.getDouble("accuracy");
                    double mining = saveData.getDouble("mining");
                    double intelligence = saveData.getDouble("intelligence");
                    double potionCrafting = saveData.getDouble("potion crafting");
                    double smithing = saveData.getDouble("smithing");
                    double earthDefence = saveData.getDouble("earth defence");
                    double poisonDefence = saveData.getDouble("poison defence");
                    double iceDefence = saveData.getDouble("ice defence");
                    double vitality = saveData.getDouble("vitality");
                    double crafting = saveData.getDouble("crafting");
                    double cooking = saveData.getDouble("cooking");
                    double thieving = saveData.getDouble("thieving");

                    hero.setName(name);
                    hero.setCharacterClass(characterClass);
                    hero.setHp(hp);
                    hero.setAirDefence(airDefence);
                    hero.setFireDefence(fireDefence);
                    hero.setStrength(strength);
                    hero.setFishing(fishing);
                    hero.setAccuracy(accuracy);
                    hero.setMining(mining);
                    hero.setIntelligence(intelligence);
                    hero.setPotionCrafting(potionCrafting);
                    hero.setSmithing(smithing);
                    hero.setEarthDefence(earthDefence);
                    hero.setPoisonDefence(poisonDefence);
                    hero.setIceDefence(iceDefence);
                    hero.setVitality(vitality);
                    hero.setCrafting(crafting);
                    hero.setCooking(cooking);
                    hero.setThieving(thieving);
                
        
            } catch(Exception e){
                System.out.println(e);
            }


        }
    
}
