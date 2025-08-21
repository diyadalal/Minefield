package mvc;

public abstract interface AppFactory {
    public Model makeModel();
    public View makeView(Model m);
    public String getTitle();
    public String[] getHelp();
    public String about();
    String[] getEditCommands();
    public Command makeEditCommand(Model model, String type, Object source);

}