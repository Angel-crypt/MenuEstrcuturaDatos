package Menu.Options;

import ManagementDataStructure.ArrayListManagement;
import Menu.BaseMenuOption;
import Menu.Services.ReaderInput;

public class OptionArraylist extends BaseMenuOption {
    private ReaderInput reader;

    public OptionArraylist(ReaderInput reader) {
        super("Manejo de ArrayList");
        this.reader = reader;
    }

    @Override
    public void execute() {
        new ArrayListManagement(reader).execute();
    }
}
