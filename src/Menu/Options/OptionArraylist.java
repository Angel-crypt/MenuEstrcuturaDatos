package Menu.Options;

import ManagementDataStrucutre.ArrayListManagement;
import Menu.BaseMenuOption;

public class OptionArraylist extends BaseMenuOption {
    public OptionArraylist() {
        super("Manejo de ArrayList");
    }

    @Override
    public void execute(){
        System.out.println("Implementacion de ArrayList");
        new ArrayListManagement();
    }
}
