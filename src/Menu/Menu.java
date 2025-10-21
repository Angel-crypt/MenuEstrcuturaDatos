package Menu;

import Menu.Options.*;
import Menu.Services.DisplayMenu;
import Menu.Services.ManagerMenu;
import Menu.Services.ReaderInput;

public class Menu {
    public Menu() {
        DisplayMenu visualizer = new DisplayMenu();
        ReaderInput reader = new ReaderInput();
        ManagerMenu menu = new ManagerMenu(visualizer, reader);

        menu.addOption(new OptionArraylist(reader));
        menu.addOption(new OptionHashMap());
        menu.addOption(new OptionHashSet());
        menu.addOption(new OptionQueue());
        menu.addOption(new OptionTree());
        menu.addOption(new OptionExit());

        menu.execute();
    }
}