package Menu;

import Menu.Options.*;
import Menu.Services.DisplayMenu;
import Menu.Services.ManagerMenu;
import Menu.Services.ReaderInput;

public class Menu {
    public Menu(){
        DisplayMenu visualaizer = new DisplayMenu();
        ReaderInput reader = new ReaderInput();
        ManagerMenu menu = new ManagerMenu(visualaizer, reader);

        menu.addOPtion(new OptionArraylist());
        menu.addOPtion(new OptionExit());
        menu.addOPtion(new OptionHashMap());
        menu.addOPtion(new OptionHashSet());
        menu.addOPtion(new OptionQueue());
        menu.addOPtion(new OptionTree());
        menu.addOPtion(new OptionExit());

        menu.execute();
    }
}
