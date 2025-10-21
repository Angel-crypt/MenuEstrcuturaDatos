package Menu.Services;

import Menu.MenuOption;
import Menu.Options.OptionExit;

public class ManagerMenu {
    private java.util.List<MenuOption> options;
    private DisplayMenu visualizer;
    private ReaderInput reader;

    public ManagerMenu(DisplayMenu visualizer, ReaderInput reader) {
        this.options = new java.util.ArrayList<>();
        this.visualizer = visualizer;
        this.reader = reader;
    }

    public void addOption(MenuOption option) {
        options.add(option);
    }

    public void execute() {
        while (true) {
            cleanScreen();
            visualizer.show(options);

            int selection = reader.readOption(1, options.size());
            MenuOption selectOption = options.get(selection - 1);

            cleanScreen();
            selectOption.execute();

            if (selectOption instanceof OptionExit) {
                break;
            }
        }
    }

    private void cleanScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            for (int i = 0; i < 50; i++) System.out.println();
        }
    }
}
