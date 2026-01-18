import java.util.Scanner;

public class AttributeTrainingState implements GameState {

    @Override
    public void execute(Game game) {
        Scanner scanner = new Scanner(System.in);
        boolean attributeTrainingRunning = true;
        
            
        while(attributeTrainingRunning){
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Which attribute would you like to train? Mining(1), smithing(2), fishing(3), thieving(4), cooking(5), crafting(6), potion crafting(7), quit(0)");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("To exit mining, type 'quit' ");
                    while(true){
                        int randomNum = (int)(Math.random() * 101);
                        String mine = scanner.nextLine();
                        if(mine == ""){
                            System.out.println("You swing your pickaxe and mine some ore.");
                            game.hero.trainAttribute("mining");
                            if(game.hero.getMining() < 5){
                                
                                if(randomNum <=30){
                                    System.out.println("You managed to mine an iron ore");
                                    game.hero.inventory.takeIronOre();
                                }
                            }
                        }
                        else if(mine == "quit");
                        break;
                    }
                    break;

            }

        }
        
    }
}
