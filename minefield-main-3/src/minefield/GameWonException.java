package minefield;

public class GameWonException extends Exception{
    public GameWonException(){
        super("Congratulations! You won!");
    }
}
