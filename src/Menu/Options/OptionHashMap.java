package Menu.Options;

import ManagementDataStructure.HashMapManagement;
import Menu.BaseMenuOption;
import Menu.Services.ReaderInput;

public class OptionHashMap extends BaseMenuOption {
    private ReaderInput reader;
    public OptionHashMap(ReaderInput reader) {
        super("Manejo de HashMap");
        this.reader = reader;
    }

    @Override
    public void execute(){
        new HashMapManagement(reader).execute();
    }
}
