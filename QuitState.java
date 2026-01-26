import java.util.Scanner;
public class QuitState implements GameState {
    @Override
    public void execute(Game game) {
        
        System.out.println("Choose a save slot 1-5: ");
        int slot = game.scanner.nextInt();
        switch(slot){
            case 1:
                game.saveGame("Save1");
                break;
            case 2:
                game.saveGame("Save2");
                break;
            case 3:
                game.saveGame("Save3");
                break;
            case 4:
                game.saveGame("Save4");
                break;
            case 5:
                game.saveGame("Save5");
                break;
            default:
                System.out.println("Error, game was not saved");
                break;

        }

        
        game.stop();
        game.scanner.close();
    }
}
