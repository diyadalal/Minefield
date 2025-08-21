package mvc;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class View extends JPanel implements Subscriber{
    public Model model;
    public void update(){
        repaint();
    }

    public void setModel(Model newModel){
        model.unsubscribe(this);
        model = newModel;
        model.subscribe(this);
        repaint();
    }

    public View(Model model){
        this.model = model;
        model.subscribe(this);
        setSize(500, 500);
        Border blackLine = BorderFactory.createLineBorder(Color.black);
        setBorder(blackLine);
        setBackground(Color.LIGHT_GRAY);

    }
}
