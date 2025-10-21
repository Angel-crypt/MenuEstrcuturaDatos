package Menu.Options;

import ManagementDataStructure.QueueManagement;
import Menu.BaseMenuOption;

public class OptionQueue extends BaseMenuOption {
    public OptionQueue() {
        super("Manejo de Queue");
    }

    @Override
    public void execute(){
        System.out.println("Implementacion de Queue");
        new QueueManagement();
    }
}
