package minefield;

import mvc.*;
public class MinefieldCommand extends Command{
  Heading heading;

  public MinefieldCommand(Model model, String heading) {
    super(model);
    this.heading = Heading.parse(heading);
  }

  public void execute() {
    Minefield minefield = (Minefield) model;
    try{
        minefield.move(heading);
    }
    catch(Exception e){
        Utilities.error(e);
    }
    
  }

}