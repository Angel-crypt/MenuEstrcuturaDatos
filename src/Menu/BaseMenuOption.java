package Menu;

public abstract class BaseMenuOption implements MenuOption{
    protected String description;

    public BaseMenuOption(String description){
        this.description=description;
    }

    @Override
    public String obtainDescription(){
        return description;
    }
}
