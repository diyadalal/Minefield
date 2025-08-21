package minefield;

import mvc.*;
import java.awt.*;

public class MinefieldView extends View {
    private static final int CELL_SIZE = 30;
    private static final int GRID_SIZE = 20;

    public MinefieldView(Model minefield) {
        super(minefield);
        setPreferredSize(new Dimension(GRID_SIZE * CELL_SIZE, GRID_SIZE * CELL_SIZE));
    }

    public void setModel(Model newModel) {
        super.setModel(newModel);
        repaint();
    }


    public void paintComponent(Graphics gc) {
        Minefield mineField = (Minefield) model;
        Graphics2D g2 = (Graphics2D) gc;
        MinefieldLayout grid = new MinefieldLayout(mineField);
        grid.draw(g2);
    }
}
