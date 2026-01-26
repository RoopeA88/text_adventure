import java.util.Scanner;

public class AttributeTrainingState implements GameState {

    @Override
    public void execute(Game game) {
        
        boolean attributeTrainingRunning = true;
        
            
        while(attributeTrainingRunning){
            game.clearScreen();
            System.out.println("Which attribute would you like to train? Mining(1), smithing(2), fishing(3), thieving(4), cooking(5), crafting(6), potion crafting(7), quit(0)");
            int choice = game.scanner.nextInt();
            
            switch(choice){
                case 0:
                    game.setState(new HomeState());
                    attributeTrainingRunning = false;
                    break;
                case 1:
                    
                    while(true){
                        int randomNum = (int)(Math.random() * 101);
                        String mine = game.scanner.nextLine();
                        game.clearScreen();
                        
                        if(mine == ""){
                            game.clearScreen();
                            System.out.println("Press Enter to mine. To exit mining, type 'quit' ");
                            System.out.println("You swing your pickaxe and mine some ore.");
                            game.hero.trainAttribute("mining");
                            if(game.hero.getMining() <= 4 && game.hero.getMining()<5){
                                
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
                                } else if(randomNum >55 && randomNum <=63){
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
                    case 2:
                        while(true){
                            
                            
                            String smith = game.scanner.nextLine();
                            if(smith.equals("")){
                                game.clearScreen();
                                
                                System.out.println("You swing your hammer on a hot piece of metal");
                                game.hero.trainAttribute("smithing");
                                System.out.println("Press Enter to smith. To exit smithing, type 'quit' ");
                            } else if(smith.equals("quit")){
                                break;
                            }
                    }
                    break;
                    case 3:
                        while(true){
                            String fish = game.scanner.nextLine();
                            int randomNumber = (int)(Math.random()*101);
                            if(fish.equals("")){
                                System.out.println("You swing your fishing rod and wait for a fish to bite.");
                                game.hero.trainAttribute("fishing");
                                System.out.println("Press Enter to fish. To exit fishing, type 'quit' ");
                                if(game.hero.getFishing() <=4){
                                    if(randomNumber <=30){
                                        game.inventory.takeShrimp();
                                    }
                                } else if(game.hero.getFishing() >=5 && game.hero.getFishing() <=9){
                                    if(randomNumber <=30){
                                        game.inventory.takeShrimp();
                                    }
                                    else if(randomNumber >30 && randomNumber <=45){
                                        game.inventory.takeHerring();
                                    }
                                } else if(game.hero.getFishing() >=10 && game.hero.getFishing() <=14){
                                    if(randomNumber <= 30){
                                        game.inventory.takeShrimp();
                                    } else if(randomNumber >30 && randomNumber <=45){
                                        game.inventory.takeHerring();
                                    } else if(randomNumber >45 && randomNumber <=55){
                                        game.inventory.takeRainbowfish();
                                    }
                                } else if(game.hero.getFishing() >=15 && game.hero.getFishing() <=19){
                                    if(randomNumber <= 30){
                                        game.inventory.takeShrimp();
                                    } else if(randomNumber >30 && randomNumber <=45){
                                        game.inventory.takeHerring();
                                    } else if(randomNumber >45 && randomNumber <=55){
                                        game.inventory.takeRainbowfish();
                                    } else if(randomNumber >55 && randomNumber <=63){
                                        game.inventory.takeBass();
                                    }
                                } else if(game.hero.getFishing() >=35 && game.hero.getFishing() <=49){
                                    if(randomNumber <= 30){
                                        game.inventory.takeShrimp();
                                    } else if(randomNumber >30 && randomNumber <=45){
                                        game.inventory.takeHerring();
                                    } else if(randomNumber >45 && randomNumber <=55){
                                        game.inventory.takeRainbowfish();
                                    } else if(randomNumber >55 && randomNumber <=63){
                                        game.inventory.takeBass();
                                    } else if(randomNumber >63 && randomNumber <=68){
                                        game.inventory.takeLobster();
                                    }
                                } else if(game.hero.getFishing() >=50 && game.hero.getFishing() <=84){
                                    if(randomNumber <= 30){
                                        game.inventory.takeShrimp();
                                    } else if(randomNumber >30 && randomNumber <=45){
                                        game.inventory.takeHerring();
                                    } else if(randomNumber >45 && randomNumber <=55){
                                        game.inventory.takeRainbowfish();
                                    } else if(randomNumber >55 && randomNumber <=63){
                                        game.inventory.takeBass();
                                    } else if(randomNumber >63 && randomNumber <=68){
                                        game.inventory.takeLobster();
                                    } else if(randomNumber >68 && randomNumber <=71){
                                        game.inventory.takeTuna();
                                    }
                                } else if(game.hero.getFishing() >=85){
                                    if(randomNumber <= 30){
                                        game.inventory.takeShrimp();
                                    } else if(randomNumber >30 && randomNumber <=45){
                                        game.inventory.takeHerring();
                                    } else if(randomNumber >45 && randomNumber <=55){
                                        game.inventory.takeRainbowfish();
                                    } else if(randomNumber >55 && randomNumber <=63){
                                        game.inventory.takeBass();
                                    } else if(randomNumber >63 && randomNumber <=68){
                                        game.inventory.takeLobster();
                                    } else if(randomNumber >68 && randomNumber <=71){
                                        game.inventory.takeTuna();
                                    } else if(randomNumber ==72){
                                        game.inventory.takeShark();
                                    }
                                }
                                

                                
                            } else if(fish.equals("quit")){
                                break;
                            }
                        }
                        break;
            }

        }
        
    }
}
