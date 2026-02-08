public class MiningState implements GameState {

    public void execute(Game game){
        while(true){
            int randomNum = (int)(Math.random() * 101);
            String mine = game.scanner.nextLine();
            game.clearScreen();
            
            if(mine.equals("")){
                game.clearScreen();
                System.out.println("Press Enter to mine. To exit mining, type 'quit' ");
                System.out.println("You swing your pickaxe and mine some ore.");
                game.hero.trainAttribute("mining");
                if(game.hero.getMining() <= 4 && game.hero.getMining()<5){
                    
                    if(randomNum <=10){
                        
                        game.hero.inventory.takeIronOre();
                    }
                } else if(game.hero.getMining() >=5 && game.hero.getMining() <=9){

                    if(randomNum <=10){
                        
                        game.hero.inventory.takeIronOre();
                    } else if(randomNum>10 && randomNum <=17){ 
                        game.hero.inventory.takeCoal();  
                    }
                } else if(game.hero.getMining() >=10 && game.hero.getMining() <=14){
                    if(randomNum <=10){
                        game.hero.inventory.takeIronOre();
                    } else if(randomNum >10 && randomNum <=17){
                        game.hero.inventory.takeCoal();
                    } else if(randomNum >17 && randomNum <=23){
                        game.hero.inventory.takeSilver();
                    }
                } else if(game.hero.getMining() >= 15 && game.hero.getMining() <=19){
                    if(randomNum <=10){
                        game.hero.inventory.takeIronOre();
                    } else if(randomNum >10 && randomNum <=17){
                        game.hero.inventory.takeCoal();
                    } else if(randomNum >17 && randomNum <=23){
                        game.hero.inventory.takeSilver();
                    } else if(randomNum >23 && randomNum <=28){
                        game.hero.inventory.takeGold();
                    }
                } else if(game.hero.getMining() >=35 && game.hero.getMining() <=49){
                    if(randomNum <=10){
                        game.hero.inventory.takeIronOre();
                    } else if(randomNum >10 && randomNum <=17){
                        game.hero.inventory.takeCoal();
                    } else if(randomNum >17 && randomNum <=23){
                        game.hero.inventory.takeSilver();
                    } else if(randomNum >23 && randomNum <=28){
                        game.hero.inventory.takeGold();
                    } else if(randomNum >28 && randomNum <=32){
                        game.hero.inventory.takeMithril();
                    }
                } else if(game.hero.getMining() >=50 && game.hero.getMining() <=84){
                    if(randomNum <=10){
                        game.hero.inventory.takeIronOre();
                    } else if(randomNum >10 && randomNum <=17){
                        game.hero.inventory.takeCoal();
                    } else if(randomNum >17 && randomNum <=23){
                        game.hero.inventory.takeSilver();
                    } else if(randomNum >23 && randomNum <=28){
                        game.hero.inventory.takeGold();
                    } else if(randomNum >28 && randomNum <=32){
                        game.hero.inventory.takeMithril();
                    } else if(randomNum >32 && randomNum <=35){
                        game.hero.inventory.takeAdamantite();
                    }
                } else if(game.hero.getMining() >=85){
                    if(randomNum <=10){
                        game.hero.inventory.takeIronOre();
                    } else if(randomNum >10 && randomNum <=17){
                        game.hero.inventory.takeCoal();
                    } else if(randomNum >17 && randomNum <=23){
                        game.hero.inventory.takeSilver();
                    } else if(randomNum >23 && randomNum <=28){
                        game.hero.inventory.takeGold();
                    } else if(randomNum >28 && randomNum <=32){
                        game.hero.inventory.takeMithril();
                    } else if(randomNum >32 && randomNum <=35){
                        game.hero.inventory.takeAdamantite();
                    } else if(randomNum == 36){
                        game.hero.inventory.takeRunite();
                    }
                }
            }
            else if(mine.equals("quit")){
                game.setState(new AttributeTrainingState());
                break;
            }
            
        }
        
    }
    
}
