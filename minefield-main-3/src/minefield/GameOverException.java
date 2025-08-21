package minefield;

public class GameOverException extends Exception{
    public GameOverException(){
        super("Game Over! You stepped on a mine!");
    }
}
