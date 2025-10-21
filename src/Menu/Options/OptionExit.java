package Menu.Options;

import Menu.BaseMenuOption;

public class OptionExit extends BaseMenuOption {
    public OptionExit() {
        super("Salir");
    }

    @Override
    public void execute() {
        System.out.println("\n¡Hasta luego!");
    }
}
