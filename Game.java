public class Game {
    private GameState currentState;
    private boolean running = true;
    Inventory inventory = new Inventory();
    Character hero = Character.getInstance(inventory);
    
    public Game(){
        clearScreen();
        hero.chooseName();
        System.out.println("Your name is: ");
        System.out.println(hero.getName());
        hero.chooseCharacterClass();
        System.out.println("Your class is: ");
        System.out.println(hero.getCharacterClass());

        setState(new HomeState());
        

    }

    public  void setState(GameState state){
        currentState = state;
    }
    public void run(){
        while(running){
            if(currentState != null){
                currentState.execute(this);
            } else{
                running = false;
            }
        }
    }
    public void stop(){
        running = false;
    }

    public void clearScreen(){
        for(int i = 0; i<10; i++){
            System.out.println();
        }
    }
}
