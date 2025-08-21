package minefield;

public class MovingWhileGameOverException extends Exception{
    public MovingWhileGameOverException() {
        super("Gave Over! Cannot move!");
    }
}
