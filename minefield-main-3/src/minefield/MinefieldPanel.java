package minefield;

import mvc.*;
import javax.swing.*;
import java.awt.*;

public class MinefieldPanel extends AppPanel {

    JButton N = new JButton("N");
    JButton S = new JButton("S");
    JButton E = new JButton("E");
    JButton W = new JButton("W");
    JButton NW = new JButton("NW");
    JButton NE = new JButton("NE");
    JButton SE = new JButton("SE");
    JButton SW = new JButton("SW");


    public MinefieldPanel(AppFactory factory) {
        super(factory);
        setLayout(new BorderLayout());
        // buttons panel
        JPanel controlPanel = new JPanel();
        JPanel keys = new JPanel();
        keys.setLayout(new GridLayout(4,2, 25, 25));

        controlPanel = new JPanel();
        controlPanel.add(N);
        N.addActionListener(this);
        keys.add(controlPanel);

        controlPanel = new JPanel();
        controlPanel.add(S);
        S.addActionListener(this);
        keys.add(controlPanel);

        controlPanel = new JPanel();
        controlPanel.add(W);
        W.addActionListener(this);
        keys.add(controlPanel);

        controlPanel = new JPanel();
        controlPanel.add(E);
        E.addActionListener(this);
        keys.add(controlPanel);
        
        controlPanel = new JPanel();
        controlPanel.add(NW);
        NW.addActionListener(this);
        keys.add(controlPanel);

        controlPanel = new JPanel();
        controlPanel.add(NE);
        NE.addActionListener(this);
        keys.add(controlPanel);

        controlPanel = new JPanel();
        controlPanel.add(SW);
        SW.addActionListener(this);
        keys.add(controlPanel);

        controlPanel = new JPanel();
        controlPanel.add(SE);
        SE.addActionListener(this);
        keys.add(controlPanel);

        // add(controlPanel, BorderLayout.WEST);
        add(keys, BorderLayout.WEST);
        add(view, BorderLayout.EAST);
    }



    public static void main(String[] args) {
        AppFactory factory = new MinefieldFactory();
        AppPanel panel = new MinefieldPanel(factory);
        panel.display();
    }
}