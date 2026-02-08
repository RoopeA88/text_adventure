public class FishingState implements GameState {

    public void execute(Game game){
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
                game.setState(new AttributeTrainingState());
                break;
            }
        } 
    }
    
}
