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
                                    if(randomNumber <=10){
                                        game.inventory.takeShrimp();
                                    }
                                } else if(game.hero.getFishing() >=5 && game.hero.getFishing() <=9){
                                    if(randomNumber <=10){
                                        game.inventory.takeShrimp();
                                    }
                                    else if(randomNumber >10 && randomNumber <=17){
                                        game.inventory.takeHerring();
                                    }
                                } else if(game.hero.getFishing() >=10 && game.hero.getFishing() <=14){
                                    if(randomNumber <= 10){
                                        game.inventory.takeShrimp();
                                    } else if(randomNumber >10 && randomNumber <=17){
                                        game.inventory.takeHerring();
                                    } else if(randomNumber >17 && randomNumber <=23){
                                        game.inventory.takeRainbowfish();
                                    }
                                } else if(game.hero.getFishing() >=15 && game.hero.getFishing() <=19){
                                    if(randomNumber <= 10){
                                        game.inventory.takeShrimp();
                                    } else if(randomNumber >10 && randomNumber <=17){
                                        game.inventory.takeHerring();
                                    } else if(randomNumber >17 && randomNumber <=23){
                                        game.inventory.takeRainbowfish();
                                    } else if(randomNumber >23 && randomNumber <=28){
                                        game.inventory.takeBass();
                                    }
                                } else if(game.hero.getFishing() >=35 && game.hero.getFishing() <=49){
                                    if(randomNumber <= 10){
                                        game.inventory.takeShrimp();
                                    } else if(randomNumber >10 && randomNumber <=17){
                                        game.inventory.takeHerring();
                                    } else if(randomNumber >17 && randomNumber <=23){
                                        game.inventory.takeRainbowfish();
                                    } else if(randomNumber >23 && randomNumber <=28){
                                        game.inventory.takeBass();
                                    } else if(randomNumber >28 && randomNumber <=32){
                                        game.inventory.takeLobster();
                                    }
                                } else if(game.hero.getFishing() >=50 && game.hero.getFishing() <=84){
                                    if(randomNumber <= 10){
                                        game.inventory.takeShrimp();
                                    } else if(randomNumber >10 && randomNumber <=17){
                                        game.inventory.takeHerring();
                                    } else if(randomNumber >17 && randomNumber <=23){
                                        game.inventory.takeRainbowfish();
                                    } else if(randomNumber >23 && randomNumber <=28){
                                        game.inventory.takeBass();
                                    } else if(randomNumber >28 && randomNumber <=32){
                                        game.inventory.takeLobster();
                                    } else if(randomNumber >32 && randomNumber <=35){
                                        game.inventory.takeTuna();
                                    }
                                } else if(game.hero.getFishing() >=85){
                                    if(randomNumber <= 10){
                                        game.inventory.takeShrimp();
                                    } else if(randomNumber >10 && randomNumber <=17){
                                        game.inventory.takeHerring();
                                    } else if(randomNumber >17 && randomNumber <=23){
                                        game.inventory.takeRainbowfish();
                                    } else if(randomNumber >23 && randomNumber <=28){
                                        game.inventory.takeBass();
                                    } else if(randomNumber >28 && randomNumber <=32){
                                        game.inventory.takeLobster();
                                    } else if(randomNumber >32 && randomNumber <=35){
                                        game.inventory.takeTuna();
                                    } else if(randomNumber ==36){
                                        game.inventory.takeShark();
                                    }
                                }
                                

                                
                            } else if(fish.equals("quit")){
                                break;
                            }
                        } 
                        case 4:
                            while(true){
                                String thieve = game.scanner.nextLine();
                                int randomNumber = (int)(Math.random() *101);
                                if(thieve.equals("")){
                                    game.clearScreen();
                                    System.out.println("Press Enter to thieve. To exit thieving, type 'quit' ");
                                    System.out.println("You slip your hand in the pocket of an unsuspecting individual and try to find something of value.");
                                    if(game.hero.getThieving() <=4){
                                        if(randomNumber <=10){
                                            game.hero.inventory.takeCopperCoin();
                                        }
                                    } else if(game.hero.getThieving() >=5 && game.hero.getThieving() <=9){
                                        if(randomNumber <=10){
                                            game.hero.inventory.takeCopperCoin();
                                        } else if(randomNumber >10 && randomNumber <=17){
                                            game.hero.inventory.takeSilverCoin();
                                        }
                                    } else if(game.hero.getThieving() >=10 && game.hero.getThieving() <=14){
                                        if(randomNumber <=10){
                                            game.hero.inventory.takeCopperCoin();
                                        } else if(randomNumber >10 && randomNumber <=17){
                                            game.hero.inventory.takeSilverCoin();
                                        } else if(randomNumber >17 && randomNumber <=23){
                                            game.hero.inventory.takeGoldCoin();
                                        }
                                    } else if(game.hero.getThieving() >=15 && game.hero.getThieving() <=19){
                                        if(randomNumber <=10){
                                            game.hero.inventory.takeCopperCoin();
                                        } else if(randomNumber >10 && randomNumber <=17){
                                            game.hero.inventory.takeSilverCoin();
                                        } else if(randomNumber >17 && randomNumber <=23){
                                            game.hero.inventory.takeGoldCoin();
                                        } else if(randomNumber >23 && randomNumber <=28){
                                            game.hero.inventory.takePlatinumCoin();


                                }
                            }

                        break;
            }

        }
        
    }
}
