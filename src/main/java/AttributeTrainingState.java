import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
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
                    
                    game.setState(new MiningState());
                    attributeTrainingRunning = false;
                    break;
                case 2:
                    game.setState(new SmithingState());
                    attributeTrainingRunning = false;
                    break;
                case 3:
                    game.setState(new FishingState());
                    attributeTrainingRunning= false;
                    break;
                case 4:
                    game.setState(new ThievingState());
                    attributeTrainingRunning = false;
                    break;
                            
            }
        
        }
    }
}