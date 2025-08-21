package minefield;
import mvc.Model;
import mvc.Utilities;


public class Minefield extends Model{
    public static int percentMined;
    private int rows, columns;
    private boolean[][] mines;
    private boolean[][] visited;
    private int playerRow, playerColumn;
    private boolean gameOver;

    public Minefield(){
        this.rows = 20;
        this.columns = 20;
        percentMined = 5;
        this.mines = new boolean[rows][columns];
        this.visited = new boolean[rows][columns];
        this.playerRow = 0;
        this.playerColumn = 0;
        this.gameOver = false;
        placeMines(percentMined);
        visited[0][0] = true;
    }

    public void placeMines(int percentMined){
        int numMinesPlaced = 0;
        double mineCount = (rows * columns) * ((double) percentMined/ (double) 100);
        while (numMinesPlaced < (int) mineCount){
            int row = Utilities.rng.nextInt(rows);
            int column = Utilities.rng.nextInt(columns);
            if (!mines[row][column] && !(row == 0 && column == 0) && !(row == rows - 1 && column == columns - 1)){
                mines[row][column] = true;
                numMinesPlaced++;
            }
        }
    }

    public void move(Heading heading) throws Exception{
        int newRow = playerRow;
        int newColumn = playerColumn;
        if (!gameOver){
            switch(heading){
                
                case N: {
                    newRow = playerRow - 1;;

                    if (newRow < 0 || newColumn < 0 || newRow > rows - 1 || newColumn > columns - 1){
                        throw new OutOfBoundsException();
                    }
                    playerRow = newRow;
                    playerColumn = newColumn;
                    visited[playerRow][playerColumn] = true;
        
                    if (mines[playerRow][playerColumn]){
                        gameOver = true;
                        throw new GameOverException();
                    }
                    if (visited[rows - 1][columns - 1]){
                        gameOver = true;
                        throw new GameWonException();
                    }
                    System.out.println("Moved N at " + playerRow + ", " + playerColumn + " " + visited[playerRow][playerColumn]);
                    changed();
                    break;
                }

                case W: {
                    newColumn = playerColumn - 1;

                    if (newRow < 0 || newColumn < 0 || newRow > rows - 1 || newColumn > columns - 1){
                        throw new OutOfBoundsException();
                    }
                    playerRow = newRow;
                    playerColumn = newColumn;
                    visited[playerRow][playerColumn] = true;
        
                    if (mines[playerRow][playerColumn]){
                        gameOver = true;
                        throw new GameOverException();
                    }
                    if (visited[rows - 1][columns - 1]){
                        gameOver = true;
                        throw new GameWonException();
                    }
                    System.out.println("Moved W at " + playerRow + ", " + playerColumn  + visited[playerRow][playerColumn]);
                    changed();
                    break;
                 }

                case E: {
                    newColumn = playerColumn + 1;

                    if (newRow < 0 || newColumn < 0 || newRow > rows - 1 || newColumn > columns - 1){
                        throw new OutOfBoundsException();
                    }
                    playerRow = newRow;
                    playerColumn = newColumn;
                    visited[playerRow][playerColumn] = true;
        
                    if (mines[playerRow][playerColumn]){
                        gameOver = true;
                        throw new GameOverException();
                    }
                    if (visited[rows - 1][columns - 1]){
                        gameOver = true;
                        throw new GameWonException();
                    }
                    System.out.println("Moved E at " + playerRow + ", " + playerColumn  + visited[playerRow][playerColumn]);
                    changed();
                    break;
                 }

                case S: {
                    newRow = playerRow + 1;
                  
                    if (newRow < 0 || newColumn < 0 || newRow > rows - 1 || newColumn > columns - 1){
                        throw new OutOfBoundsException();
                    }
                    playerRow = newRow;
                    playerColumn = newColumn;
                    visited[playerRow][playerColumn] = true;
        
                    if (mines[playerRow][playerColumn]){
                        gameOver = true;
                        throw new GameOverException();
                    }
                    if (visited[rows - 1][columns - 1]){
                        gameOver = true;
                        throw new GameWonException();
                    }
                    System.out.println("Moved S at " + playerRow + ", " + playerColumn  + visited[playerRow][playerColumn]);
                    changed();
                    break;
                 }
                case NW: {
                    newRow = playerRow - 1;
                    newColumn = playerColumn - 1;
                    if (newRow < 0 || newColumn < 0 || newRow > rows - 1 || newColumn > columns - 1){
                        throw new OutOfBoundsException();
                    }
                    playerRow = newRow;
                    playerColumn = newColumn;
                    visited[playerRow][playerColumn] = true;
        
                    if (mines[playerRow][playerColumn]){
                        gameOver = true;
                        throw new GameOverException();
                    }
                    if (visited[rows - 1][columns - 1]){
                        gameOver = true;
                        throw new GameWonException();
                    }
                    System.out.println("Moved NW at " + playerRow + ", " + playerColumn + visited[playerRow][playerColumn]);
                    changed();
                    break;
                 }

                case NE: {
                    newRow = playerRow - 1;
                    newColumn = playerColumn + 1;

                    if (newRow < 0 || newColumn < 0 || newRow > rows - 1 || newColumn > columns - 1){
                        throw new OutOfBoundsException();
                    }
                    playerRow = newRow;
                    playerColumn = newColumn;
                    visited[playerRow][playerColumn] = true;
        
                    if (mines[playerRow][playerColumn]){
                        gameOver = true;
                        throw new GameOverException();
                    }
                    if (visited[rows - 1][columns - 1]){
                        gameOver = true;
                        throw new GameWonException();
                    }
                    System.out.println("Moved NE at " + playerRow + ", " + playerColumn  + visited[playerRow][playerColumn]);
                    changed();
                    break;
                 }

                case SW: {
                    newRow = playerRow + 1;
                    newColumn = playerColumn - 1;

                    if (newRow < 0 || newColumn < 0 || newRow > rows - 1 || newColumn > columns - 1){
                        throw new OutOfBoundsException();
                    }
                    playerRow = newRow;
                    playerColumn = newColumn;
                    visited[playerRow][playerColumn] = true;
        
                    if (mines[playerRow][playerColumn]){
                        gameOver = true;
                        throw new GameOverException();
                    }
                    if (visited[rows - 1][columns - 1]){
                        gameOver = true;
                        throw new GameWonException();
                    }
                    System.out.println("Moved SW at " + playerRow + ", " + playerColumn  + visited[playerRow][playerColumn]);
                    changed();
                    break;
                 }
                case SE: {
                    newRow = playerRow + 1;
                    newColumn = playerColumn + 1;
                    if (newRow < 0  || newColumn < 0 || newRow > rows - 1 || newColumn > columns - 1){
                        throw new OutOfBoundsException();
                    }
                    playerRow = newRow;
                    playerColumn = newColumn;
                    visited[playerRow][playerColumn] = true;
        
                    if (mines[playerRow][playerColumn]){
                        gameOver = true;
                        throw new GameOverException();
                    }
                    if (visited[rows - 1][columns - 1]){
                        gameOver = true;
                        throw new GameWonException();
                    }
                    System.out.println("Moved SE at " + playerRow + ", " + playerColumn  + visited[playerRow][playerColumn]);
                    changed();
                    break;
                 }
            }
        }
        else {
            throw new MovingWhileGameOverException();
        }
    }
    
    public int minesNearby(int currentRow, int currentColumn){
        int count = 0;
        for (int x = -1; x <= 1; x++) {
            for (int y = -1; y <= 1; y++) {
                int newRow = currentRow + x;
                int newCol = currentColumn + y;
                if (newRow >= 0 && newCol >= 0 && newRow < rows && newCol < columns) {
                    if (mines[newRow][newCol]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public boolean isGameOver(){
        return gameOver;
    }   

    public int getPlayerRow(){
        return playerRow;
    }
    
    public int getPlayerColumn(){
        return playerColumn;
    }

    public boolean[][] getVisited(){
        return visited;
    }

}
