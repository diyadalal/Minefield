package minefield;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class MinefieldLayout {
    private final Minefield mineField;
    private static final int cellSize = 30;
    private static final int rows = 20;
    private static final int columns = 20;

    public MinefieldLayout(Minefield mineField) {
        this.mineField = mineField;
    }

    public void draw(Graphics2D gc) {
        boolean[][] visited = mineField.getVisited();
        int playerRow = mineField.getPlayerRow();
        int playerColumn = mineField.getPlayerColumn();

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {

                int x = c * cellSize;
                int y = r * cellSize;
                Rectangle2D.Double cell = new Rectangle2D.Double(x, y, cellSize, cellSize);

                // fill color = gray
                gc.setColor(Color.DARK_GRAY);
                gc.fill(cell);

                if (visited[r][c]) {
                    int mineCount = mineField.minesNearby(r,c);
                    gc.setColor(Color.WHITE);
                    gc.drawString(String.valueOf(mineCount), x + cellSize / 2 - 4, y + cellSize / 2 + 4);
                } else {
                    // ? for unrevealed cells
                    gc.setColor(Color.LIGHT_GRAY);
                    gc.drawString("?", x + cellSize / 2 - 4, y + cellSize / 2 + 4);
                }

                // white border for visited cells
                if (visited[r][c]) {
                    gc.setColor(Color.WHITE);
                } else {
                    gc.setColor(Color.BLACK);
                }
                gc.draw(cell);

            }
        }

        // goal cell
        int goalX = (columns- 1) * cellSize;
        int goalY = (rows - 1) * cellSize;
        Rectangle2D.Double goalCell = new Rectangle2D.Double(goalX, goalY, cellSize, cellSize);

        gc.setColor(Color.DARK_GRAY);
        gc.fill(goalCell);

        gc.setColor(Color.GREEN); //green border
        gc.draw(goalCell);

        int playerX = playerColumn * cellSize;
        int playerY = playerRow * cellSize;
        Rectangle2D.Double playerCell = new Rectangle2D.Double(playerX, playerY, cellSize, cellSize);

        gc.setColor(Color.WHITE); // white border for the player
        gc.draw(playerCell);
    }
}