public class SmithingState implements GameState{
    
    public void execute(Game game){
        while(true){
                        
                        
            String smith = game.scanner.nextLine();
            if(smith.equals("")){
                game.clearScreen();
                
                System.out.println("You swing your hammer on a hot piece of metal");
                game.hero.trainAttribute("smithing");
                System.out.println("Press Enter to smith. To exit smithing, type 'quit' ");
            } else if(smith.equals("quit")){
                game.setState(new AttributeTrainingState());
                break;
            }
    }
    
    }
}
