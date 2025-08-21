package minefield;

import mvc.*;

public class MinefieldFactory implements AppFactory {

    public Model makeModel() {
        return new Minefield(); 
    }

    public View makeView(Model m) {
        return new MinefieldView((Minefield) m); 
    }

    public String[] getEditCommands() {
        return new String[] {"N", "S", "W", "E", "NE", "NW", "SE", "SW"}; 
    }

    public Command makeEditCommand(Model model, String heading, Object source) {
        return new MinefieldCommand(model, heading); 
    }

    public String getTitle() {
        return "Minefield Game"; 
    }

    public String[] getHelp() {
        return new String[] {
            "Click Move to move Sargent Rock through the minefield.",
            "Avoid mines and reach the goal."
        }; 
    }

    public String about() {
        return "Mine Field Game version 1.0";
    }
}

