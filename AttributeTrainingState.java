import java.util.Scanner;

public class AttributeTrainingState implements GameState {

    @Override
    public void execute(Game game) {
        Scanner scanner = new Scanner(System.in);
        boolean attributeTrainingRunning = true;
        
            
        while(attributeTrainingRunning){
            game.clearScreen();
            System.out.println("Which attribute would you like to train? Mining(1), smithing(2), fishing(3), thieving(4), cooking(5), crafting(6), potion crafting(7), quit(0)");
            int choice = scanner.nextInt();
            
            switch(choice){
                case 1:
                    
                    while(true){
                        int randomNum = (int)(Math.random() * 101);
                        String mine = scanner.nextLine();
                        game.clearScreen();
                        
                        if(mine == ""){
                            game.clearScreen();
                            System.out.println("Press Enter to mine. To exit mining, type 'quit' ");
                            System.out.println("You swing your pickaxe and mine some ore.");
                            game.hero.trainAttribute("mining");
                            if(game.hero.getMining() <= 4){
                                
                                if(randomNum <=30){
                                    
                                    game.hero.inventory.takeIronOre();
                                }
                            } else if(game.hero.getMining() >=5 && game.hero.getMining() <=9){

                                if(randomNum <=30){
                                    
                                    game.hero.inventory.takeIronOre();
                                } else if(randomNum>30 && randomNum <=45){ 
                                    game.hero.inventory.takeCoal();  
                                }
                            } else if(game.hero.getMining() >=10 && game.hero.getMining() <=14){
                                if(randomNum <=30){
                                    game.hero.inventory.takeIronOre();
                                } else if(randomNum >30 && randomNum <=45){
                                    game.hero.inventory.takeCoal();
                                } else if(randomNum >45 && randomNum <=55){
                                    game.hero.inventory.takeSilver();
                                }
                            } else if(game.hero.getMining() >= 15 && game.hero.getMining() <=19){
                                if(randomNum <=30){
                                    game.hero.inventory.takeIronOre();
                                } else if(randomNum >30 && randomNum <=45){
                                    game.hero.inventory.takeCoal();
                                } else if(randomNum >45 && randomNum <=55){
                                    game.hero.inventory.takeSilver();
                                } else if(randomNum >55 && randomNum <63){
                                    game.hero.inventory.takeGold();
                                }
                            } else if(game.hero.getMining() >=35 && game.hero.getMining() <=49){
                                if(randomNum <=30){
                                    game.hero.inventory.takeIronOre();
                                } else if(randomNum >30 && randomNum <=45){
                                    game.hero.inventory.takeCoal();
                                } else if(randomNum >45 && randomNum <=55){
                                    game.hero.inventory.takeSilver();
                                } else if(randomNum >55 && randomNum <=63){
                                    game.hero.inventory.takeGold();
                                } else if(randomNum >63 && randomNum <=68){
                                    game.hero.inventory.takeMithril();
                                }
                            } else if(game.hero.getMining() >=50 && game.hero.getMining() <=84){
                                if(randomNum <=30){
                                    game.hero.inventory.takeIronOre();
                                } else if(randomNum >30 && randomNum <=45){
                                    game.hero.inventory.takeCoal();
                                } else if(randomNum >45 && randomNum <=55){
                                    game.hero.inventory.takeSilver();
                                } else if(randomNum >55 && randomNum <=63){
                                    game.hero.inventory.takeGold();
                                } else if(randomNum >63 && randomNum <=68){
                                    game.hero.inventory.takeMithril();
                                } else if(randomNum >68 && randomNum <=71){
                                    game.hero.inventory.takeAdamantite();
                                }
                            } else if(game.hero.getMining() >=85){
                                if(randomNum <=30){
                                    game.hero.inventory.takeIronOre();
                                } else if(randomNum >30 && randomNum <=45){
                                    game.hero.inventory.takeCoal();
                                } else if(randomNum >45 && randomNum <=55){
                                    game.hero.inventory.takeSilver();
                                } else if(randomNum >55 && randomNum <=63){
                                    game.hero.inventory.takeGold();
                                } else if(randomNum >63 && randomNum <=68){
                                    game.hero.inventory.takeMithril();
                                } else if(randomNum >68 && randomNum <=71){
                                    game.hero.inventory.takeAdamantite();
                                } else if(randomNum == 72){
                                    game.hero.inventory.takeRunite();
                                }
                            }
                        }
                        else if(mine.equals("quit")){
                            break;
                        }
                        
                    }
                    break;

            }

        }
        
    }
}
