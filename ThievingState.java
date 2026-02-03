import java.util.List;

public class ThievingState implements GameState {

    public void execute(Game game){

        while(true){
            String thieve = game.scanner.nextLine();
            int randomNumber = (int)(Math.random() *121);
            int randomPotionNumber = (int)(Math.random() *2);
            int randomResistancePotionNumber = (int) (Math.random() *5);
            int randomPoorRingNumber = (int) (Math.random() * 2);
            int randomPoorRingLevel = (int) (Math.random() * 2);
            int randomNormalRingLevel = (int) (Math.random() * 2);
            int randomGreaterRingLevel = (int) (Math.random() * 2);
            List<String> potionList = List.of("mp","hp");
            List<String> resistancePotionList = List.of("air", "poison", "fire", "earth", "ice");
            if(thieve.equals("")){
                game.clearScreen();
                System.out.println("Press Enter to thieve. To exit thieving, type 'quit' ");
                System.out.println("You slip your hand in the pocket of an unsuspecting individual and try to find something of value.");
                
                
                if(game.hero.getThieving() <=4){
                    if(randomNumber <=10){
                        game.hero.inventory.takeGoldCurrency(10);
                    }
                } else if(game.hero.getThieving() >=5 && game.hero.getThieving() <=9){
                    if(randomNumber <=10){
                        game.hero.inventory.takeGoldCurrency(10);
                    } else if(randomNumber >10 && randomNumber <=17){
                        game.hero.inventory.takeGoldCurrency(15);
                    } else if(randomNumber >=37 && randomNumber <=40){
                        String minorHpMinorMp = potionList.get(randomPotionNumber);
                        if(minorHpMinorMp.equals("hp")){
                            game.hero.inventory.takeMinorHpPotion();
                        } else if(minorHpMinorMp.equals("mp")){
                            game.hero.inventory.takeMinorMpPotion();
                        } else{
                            System.out.println("Error: invalid potion.");
                        }
                    } else if(randomNumber >40 && randomNumber <=44){
                        String elementalPotion = resistancePotionList.get(randomResistancePotionNumber);
                        if(elementalPotion.equals("air")){
                            game.hero.inventory.takeMinorAirPotion();
                        } else if(elementalPotion.equals("poison")){
                            game.hero.inventory.takeMinorPoisonPotion();
                        } else if(elementalPotion.equals("earth")){
                            game.hero.inventory.takeMinorAirPotion();
                        } else if(elementalPotion.equals("fire")){
                            game.hero.inventory.takeMinorFirePotion();
                        } else if(elementalPotion.equals("ice")){
                            game.hero.inventory.takeMinorIcePotion();
                        } else{
                            System.out.println("Error: Invalid resistance potion.");
                        }
                    } else if(randomNumber >50 && randomNumber <=53){
                        if(randomPoorRingLevel == 0){
                            
                            String oneElement = resistancePotionList.get(randomResistancePotionNumber);
                            game.hero.inventory.takeRandomLevelOneRing(oneElement);
                            
                        } else if(randomPoorRingLevel == 1){
                            List<Integer> elementNumbersForLevelOneDouble = List.of(0,0,0,5,5);

                                
                            game.hero.inventory.takeRandomLevelOneRingTwoElements(elementNumbersForLevelOneDouble);
                        }
                        
                    }
                } else if(game.hero.getThieving() >=10 && game.hero.getThieving() <=14){
                    if(randomNumber <=10){
                        game.hero.inventory.takeGoldCurrency(10);
                    } else if(randomNumber >10 && randomNumber <=17){
                        game.hero.inventory.takeGoldCurrency(15);
                    } else if(randomNumber >17 && randomNumber <=23){
                        game.hero.inventory.takeGoldCurrency(20);
                    } else if(randomNumber >=37 && randomNumber <=40){
                        String minorHpMinorMp = potionList.get(randomPotionNumber);
                        if(minorHpMinorMp.equals("hp")){
                            game.hero.inventory.takeMinorHpPotion();
                        } else if(minorHpMinorMp.equals("mp")){
                            game.hero.inventory.takeMinorMpPotion();
                        } else{
                            System.out.println("Error: invalid potion.");
                        }    
                    } else if(randomNumber >40 && randomNumber <=44){
                        String elementalPotion = resistancePotionList.get(randomResistancePotionNumber);
                        if(elementalPotion.equals("air")){
                            game.hero.inventory.takeMinorAirPotion();
                        } else if(elementalPotion.equals("poison")){
                            game.hero.inventory.takeMinorPoisonPotion();
                        } else if(elementalPotion.equals("earth")){
                            game.hero.inventory.takeMinorAirPotion();
                        } else if(elementalPotion.equals("fire")){
                            game.hero.inventory.takeMinorFirePotion();
                        } else if(elementalPotion.equals("ice")){
                            game.hero.inventory.takeMinorIcePotion();
                        } else{
                            System.out.println("Error: Invalid resistance potion.");
                        }
                    } else if(randomNumber >50 && randomNumber <=53){
                        if(randomPoorRingLevel == 0){
                            
                            String oneElement = resistancePotionList.get(randomResistancePotionNumber);
                            game.hero.inventory.takeRandomLevelOneRing(oneElement);
                            
                        } else if(randomPoorRingLevel == 1){
                            List<Integer> elementNumbersForLevelOneDouble = List.of(0,0,0,5,5);

                                
                            game.hero.inventory.takeRandomLevelOneRingTwoElements(elementNumbersForLevelOneDouble);
                        }
                        
                    }
                } else if(game.hero.getThieving() >=15 && game.hero.getThieving() <=19){
                    if(randomNumber <=10){
                        game.hero.inventory.takeGoldCurrency(10);
                    } else if(randomNumber >10 && randomNumber <=17){
                        game.hero.inventory.takeGoldCurrency(15);;
                    } else if(randomNumber >17 && randomNumber <=23){
                        game.hero.inventory.takeGoldCurrency(35);
                    } else if(randomNumber >23 && randomNumber <=28){
                        game.hero.inventory.takeGoldCurrency(55);
                    } else if(randomNumber >=37 && randomNumber <=40){
                        String minorHpMinorMp = potionList.get(randomPotionNumber);
                        if(minorHpMinorMp.equals("hp")){
                            game.hero.inventory.takeMinorHpPotion();
                        } else if(minorHpMinorMp.equals("mp")){
                            game.hero.inventory.takeMinorMpPotion();
                        } else{
                            System.out.println("Error: invalid potion.");
                        }    
                    } else if(randomNumber >40 && randomNumber <=44){
                        String elementalPotion = resistancePotionList.get(randomResistancePotionNumber);
                        if(elementalPotion.equals("air")){
                            game.hero.inventory.takeMinorAirPotion();
                        } else if(elementalPotion.equals("poison")){
                            game.hero.inventory.takeMinorPoisonPotion();
                        } else if(elementalPotion.equals("earth")){
                            game.hero.inventory.takeMinorAirPotion();
                        } else if(elementalPotion.equals("fire")){
                            game.hero.inventory.takeMinorFirePotion();
                        } else if(elementalPotion.equals("ice")){
                            game.hero.inventory.takeMinorIcePotion();
                        } else{
                            System.out.println("Error: Invalid resistance potion.");
                        }
                    }
                } else if(game.hero.getThieving() >=35 && game.hero.getThieving() <=49){
                    if(randomNumber <=10){
                        game.hero.inventory.takeGoldCurrency(10);
                    } else if (randomNumber >10 && randomNumber <=17){
                        game.hero.inventory.takeGoldCurrency(15);
                    } else if(randomNumber >17 && randomNumber <=23){
                        game.hero.inventory.takeGoldCurrency(20);
                    } else if(randomNumber >23 && randomNumber <=28){
                        game.hero.inventory.takeGoldCurrency(55);
                    } else if(randomNumber >28 && randomNumber <=32){
                        game.hero.inventory.takeGoldCurrency(85);
                    } else if(randomNumber >=37 && randomNumber <=40){
                        String minorHpMinorMp = potionList.get(randomPotionNumber);
                        if(minorHpMinorMp.equals("hp")){
                            game.hero.inventory.takeMinorHpPotion();
                        } else if(minorHpMinorMp.equals("mp")){
                            game.hero.inventory.takeMinorMpPotion();
                        } else{
                            System.out.println("Error: invalid potion.");
                        }    
                    } else if(randomNumber >40 && randomNumber <=44){
                        String elementalPotion = resistancePotionList.get(randomResistancePotionNumber);
                        if(elementalPotion.equals("air")){
                            game.hero.inventory.takeMinorAirPotion();
                        } else if(elementalPotion.equals("poison")){
                            game.hero.inventory.takeMinorPoisonPotion();
                        } else if(elementalPotion.equals("earth")){
                            game.hero.inventory.takeMinorAirPotion();
                        } else if(elementalPotion.equals("fire")){
                            game.hero.inventory.takeMinorFirePotion();
                        } else if(elementalPotion.equals("ice")){
                            game.hero.inventory.takeMinorIcePotion();
                        } else{
                            System.out.println("Error: Invalid resistance potion.");
                        }
                
                    } else if(randomNumber > 44 && randomNumber <=46){
                        String normalHpNormalMp = potionList.get(randomPotionNumber);
                        if(normalHpNormalMp.equals("hp")){
                            game.hero.inventory.takeHpPotion();
                        } else if(normalHpNormalMp.equals("mp")){
                            game.hero.inventory.takeMpPotion();
                        } else{
                            System.out.println("Error: invalid potion.");
                        }    
                    } else if(randomNumber >=46 && randomNumber <=48 ){
                        String elementalPotion = resistancePotionList.get(randomResistancePotionNumber);
                        if(elementalPotion.equals("air")){
                            game.hero.inventory.takeAirPotion();
                        } else if(elementalPotion.equals("poison")){
                            game.hero.inventory.takePoisonPotion();
                        } else if(elementalPotion.equals("earth")){
                            game.hero.inventory.takeAirPotion();
                        } else if(elementalPotion.equals("fire")){
                            game.hero.inventory.takeFirePotion();
                        } else if(elementalPotion.equals("ice")){
                            game.hero.inventory.takeIcePotion();
                        } else{
                            System.out.println("Error: Invalid resistance potion.");
                        }
                    }
        
                } else if(game.hero.getThieving() >50 && game.hero.getThieving() <=84){
                    if(randomNumber <=10){
                        game.hero.inventory.takeGoldCurrency(10);
                    } else if(randomNumber >10 && randomNumber <=17){
                        game.hero.inventory.takeGoldCurrency(15);
                    } else if(randomNumber >17 && randomNumber <=23){
                        game.hero.inventory.takeGoldCurrency(20);
                    } else if(randomNumber >23 && randomNumber <=28){
                        game.hero.inventory.takeGoldCurrency(55);
                    } else if(randomNumber >28 && randomNumber <=32){
                        game.hero.inventory.takeGoldCurrency(85);
                    } else if(randomNumber >32 && randomNumber <=35){
                        game.hero.inventory.takeGoldCurrency(125);
                    } else if(randomNumber >=37 && randomNumber <=40){
                        String minorHpMinorMp = potionList.get(randomPotionNumber);
                        if(minorHpMinorMp.equals("hp")){
                            game.hero.inventory.takeMinorHpPotion();
                        } else if(minorHpMinorMp.equals("mp")){
                            game.hero.inventory.takeMinorMpPotion();
                        }

                    } else if(randomNumber >40 && randomNumber <=44){
                        String elementalPotion = resistancePotionList.get(randomPotionNumber);
                        if(elementalPotion.equals("air")){
                            game.hero.inventory.takeMinorAirPotion();
                        } else if(elementalPotion.equals("poison")){
                            game.hero.inventory.takeMinorPoisonPotion();
                        } else if(elementalPotion.equals("earth")){
                            game.hero.inventory.takeMinorAirPotion();
                        } else if(elementalPotion.equals("fire")){
                            game.hero.inventory.takeMinorFirePotion();
                        } else if(elementalPotion.equals("ice")){
                            game.hero.inventory.takeMinorIcePotion();
                        } else{
                            System.out.println("Error: Invalid resistance potion.");
                        }
                    } else if(randomNumber > 44 && randomNumber <=46){
                        String normalHpNormalMp = potionList.get(randomPotionNumber);
                        if(normalHpNormalMp.equals("hp")){
                            game.hero.inventory.takeHpPotion();
                        } else if(normalHpNormalMp.equals("mp")){
                            game.hero.inventory.takeMpPotion();
                        } else{
                            System.out.println("Error: invalid potion.");
                        }    
                    } else if(randomNumber >=46 && randomNumber <=48 ){
                        String elementalPotion = resistancePotionList.get(randomResistancePotionNumber);
                        if(elementalPotion.equals("air")){
                            game.hero.inventory.takeAirPotion();
                        } else if(elementalPotion.equals("poison")){
                            game.hero.inventory.takePoisonPotion();
                        } else if(elementalPotion.equals("earth")){
                            game.hero.inventory.takeAirPotion();
                        } else if(elementalPotion.equals("fire")){
                            game.hero.inventory.takeFirePotion();
                        } else if(elementalPotion.equals("ice")){
                            game.hero.inventory.takeIcePotion();
                        } else{
                            System.out.println("Error: Invalid resistance potion.");
                        }
                    } 
                } else if(game.hero.getThieving() >=85){
                    if(randomNumber <=10){
                        game.hero.inventory.takeGoldCurrency(10);
                    } else if(randomNumber >10 && randomNumber <=17){
                        game.hero.inventory.takeGoldCurrency(15);
                    } else if(randomNumber >17 && randomNumber <=23){
                        game.hero.inventory.takeGoldCurrency(20);
                    } else if(randomNumber >23 && randomNumber <=28){
                        game.hero.inventory.takeGoldCurrency(55);
                    } else if(randomNumber >28 && randomNumber <=32){
                        game.hero.inventory.takeGoldCurrency(85);
                    } else if(randomNumber >32 && randomNumber <=35){
                        game.hero.inventory.takeGoldCurrency(125);
                    } else if(randomNumber ==36){
                        game.hero.inventory.takeGoldCurrency(200);
                    } else if(randomNumber >=37 && randomNumber <=40){
                        String minorHpMinorMp = potionList.get(randomPotionNumber);
                        if(minorHpMinorMp.equals("hp")){
                            game.hero.inventory.takeMinorHpPotion();
                        } else if(minorHpMinorMp.equals("mp")){
                            game.hero.inventory.takeMinorMpPotion();
                        }

                    } else if(randomNumber >40 && randomNumber <=44){
                        String elementalPotion = resistancePotionList.get(randomPotionNumber);
                        if(elementalPotion.equals("air")){
                            game.hero.inventory.takeMinorAirPotion();
                        } else if(elementalPotion.equals("poison")){
                            game.hero.inventory.takeMinorPoisonPotion();
                        } else if(elementalPotion.equals("earth")){
                            game.hero.inventory.takeMinorAirPotion();
                        } else if(elementalPotion.equals("fire")){
                            game.hero.inventory.takeMinorFirePotion();
                        } else if(elementalPotion.equals("ice")){
                            game.hero.inventory.takeMinorIcePotion();
                        } else{
                            System.out.println("Error: Invalid resistance potion.");
                        }
                    } else if(randomNumber > 44 && randomNumber <=46){
                        String normalHpNormalMp = potionList.get(randomPotionNumber);
                        if(normalHpNormalMp.equals("hp")){
                            game.hero.inventory.takeHpPotion();
                        } else if(normalHpNormalMp.equals("mp")){
                            game.hero.inventory.takeMpPotion();
                        } else{
                            System.out.println("Error: invalid potion.");
                        }    
                    } else if(randomNumber >=46 && randomNumber <=48 ){
                        String elementalPotion = resistancePotionList.get(randomResistancePotionNumber);
                        if(elementalPotion.equals("air")){
                            game.hero.inventory.takeAirPotion();
                        } else if(elementalPotion.equals("poison")){
                            game.hero.inventory.takePoisonPotion();
                        } else if(elementalPotion.equals("earth")){
                            game.hero.inventory.takeAirPotion();
                        } else if(elementalPotion.equals("fire")){
                            game.hero.inventory.takeFirePotion();
                        } else if(elementalPotion.equals("ice")){
                            game.hero.inventory.takeIcePotion();
                        } else{
                            System.out.println("Error: Invalid resistance potion.");
                        }
                    } else if(randomNumber ==49){
                        String greaterHpGreaterMp = potionList.get(randomPotionNumber);
                        if(greaterHpGreaterMp.equals("hp")){
                            game.hero.inventory.takeGreaterHpPotion();
                    } else if(greaterHpGreaterMp.equals("mp")){
                        game.hero.inventory.takeGreaterMpPotion();
                    } else{
                        System.out.println("Error: invalid potion.");
                    }    
                    } else if(randomNumber ==50){
                        String elementalPotion = resistancePotionList.get(randomResistancePotionNumber);
                        if(elementalPotion.equals("air")){
                            game.hero.inventory.takeGreaterAirPotion();
                        } else if(elementalPotion.equals("poison")){
                            game.hero.inventory.takeGreaterPoisonPotion();
                        } else if(elementalPotion.equals("earth")){
                            game.hero.inventory.takeGreaterAirPotion();
                        } else if(elementalPotion.equals("fire")){
                            game.hero.inventory.takeGreaterFirePotion();
                        } else if(elementalPotion.equals("ice")){
                            game.hero.inventory.takeGreaterIcePotion();
                        } else{
                            System.out.println("Error: Invalid resistance potion.");
                        }
                    } 
                } 
            } else if(thieve.equals("quit")){
                break;
            }
    
        }
    }
    
}
