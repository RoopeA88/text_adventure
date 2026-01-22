import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.lang.model.type.ErrorType;

public class HomeState implements GameState {
    Scanner scanner = new Scanner(System.in);
    boolean active = true;
    @Override

    public void execute(Game game){

        while(active){
            game.clearScreen();
            System.out.println("What would you like to do? fight common enemies(1), craft(2), fight a boss(3), train attributes(4), save and quit(5)");
            try{
                int selection = scanner.nextInt();
                switch(selection){
                    case 1:
                        game.setState(new NormalEnemiesState());
                        active = false;
                        break;
                    case 2:
                        game.setState(new CraftingState());
                        active = false;
                        break;
                    case 3:
                        game.setState(new BossState());
                        active = false;
                        break;
                    case 4:
                        game.setState(new AttributeTrainingState());
                        active = false;
                        break;
                    case 5:
                        game.setState(new QuitState());
                        active = false;
                        break;
                    //testi
                    case 6:
                        System.out.println("Mining level: "+game.hero.getMining());
                        break;
                    }
                    

                    
                
            } catch(InputMismatchException e){
                System.out.println("Invalid input.");
                continue;
            }
    }



        
    
}
}
