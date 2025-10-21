package Menu.Options;

import ManagementDataStructure.HashMapManagement;
import ManagementDataStructure.HashSetManagement;
import Menu.BaseMenuOption;
import Menu.Services.ReaderInput;

public class OptionHashSet extends BaseMenuOption {
    private ReaderInput reader;
    public OptionHashSet(ReaderInput reader) {
        super("Manejo de HashSet");
        this.reader = reader;
    }

    @Override
    public void execute(){
        new HashSetManagement(reader).execute();
    }
}
