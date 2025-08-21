package mvc;

public abstract class Command {
    public Command(Model model) {
        this.model = model;
    }

    public Model model;
    
    abstract public void execute() throws Exception;
}