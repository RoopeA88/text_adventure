public class QuitState implements GameState {
    @Override
    public void execute(Game game) {
        System.out.println("Game Saved. Thank you for playing");
        game.stop();
    }
}
